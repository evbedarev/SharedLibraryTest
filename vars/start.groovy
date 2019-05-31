#!/usr/bin/env groovy

def call() {
    echo "Start Deploy"
    Deployer deployer1 = new Deployer(this, env.BUILD_NUMBER);
    deployer1.run();
    Deployer deployer2 = new Deployer(this, env.BUILD_NUMBER);
    deployer2.run();
    echo "Deployed ${env.JOB_NAME}-${env.BUILD_NUMBER}"
    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
