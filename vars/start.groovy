#!/usr/bin/env groovy

def call() {
    echo "Start Deploy"

    new Deployer(this, 25).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS ${env.JOB_NAME}-${env.BUILD_NUMBER}' //FAILURE to fail

    return this
}
