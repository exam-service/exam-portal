pipeline {
    agent any
    tools {
        maven 'maven3'
        jdk 'jdk17'
    }

    environment {
        SCANNER_HOME = tool 'sonar-scanner'
    }

    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/exam-service/exam-portal-server.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }

//        stage('Sonar Scan') {
//            steps {
//                withSonarQubeEnv('sonar') {
//                    sh '''
//                   $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectKey=exam-portal-server -Dsonar.projectName=exam-portal-server \
//                   -Dsonar.java.binaries=.
//                   '''
//                }
//            }
//        }
    }
}