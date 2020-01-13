pipeline {
    agent any
    
    stages {
        stage('Hello') {
            agent {
                docker { 
                    image 'thyrlian/android-sdk'
                    args '-v $WORKSPACE:/project'
                }
            }
            steps {
                sh 'ls /project'
            }
        }
    }
}