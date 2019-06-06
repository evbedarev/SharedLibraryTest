#!/usr/bin/env groovy

def call() {
    echo "Start Deploy"
    Deployer deployer1 = new Deployer(this, env.BUILD_NUMBER);
    deployer1.run();
    String message = "Deployed ${env.JOB_NAME}-${env.BUILD_NUMBER} ${env.PAR1}"
    FWriter fileWriter = new FWriter("/tmp/loggroovy.txt", message)
    fileWriter.writeFile();
    echo message
    currentBuild.result = 'SUCCESS' //FAILURE to fail
    withCredentials([file(credentialsId: 'test',variable: 'FILE')]) {
        dir('subdir') {
            sh 'use $FILE'
        }
    }
    return this
}
