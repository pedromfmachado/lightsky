pipeline {
    agent any
    
    stages {
        stage('Hello') {
            agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
                sh 'mvn --version'
            }
        }
    }
}