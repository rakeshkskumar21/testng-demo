pipeline {
    agent any
    
    tools {
        maven 'Maven3' // Must match the name in Jenkins Tools
        jdk 'JDK21'
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