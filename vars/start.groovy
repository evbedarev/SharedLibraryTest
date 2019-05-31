#!/usr/bin/env groovy

def call() {
    echo "Start Deploy"

    new Deployer(script:this, 25).run()

    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
