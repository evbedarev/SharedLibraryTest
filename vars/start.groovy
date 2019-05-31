#!/usr/bin/env groovy

def call() {
    echo "Start Deploy"
    new Deployer(this, env.BUILD_NUMBER).run()
    echo "Deployed ${env.JOB_NAME}-${env.BUILD_NUMBER}"
    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
