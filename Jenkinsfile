pipeline {
    agent any
    tools {
        jdk 'Java17'
        maven 'Maven3'
    }
    stages {
        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn clean package'
            }
        }
    }
}
