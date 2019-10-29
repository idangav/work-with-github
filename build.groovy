properties([pipelineTriggers([pollSCM('*/2 * * * *')])])
node {
    stage ("checkout reposetory"){
        git branch: 'develop', url: 'https://github.com/idangav/work-with-github.git'
    }
    stage ("Hello world"){
        echo "Hello World!"
    }
}
