pipeline {
    agent any
    stages {
        stage('Jenkins Auth') {
            steps {
                echo 'Auth Interface'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}