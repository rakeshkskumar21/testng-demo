pipeline {
    agent any
    
    tools {
        maven 'Maven_3' // Must match the name in Jenkins Tools
        jdk 'Java_21'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build & Test') {
            steps {
                // Run Maven test
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Archive TestNG reports
            junit '**/target/surefire-reports/*.xml'
        }
    }
}