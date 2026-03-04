pipeline {
    agent any
    tools {
        // Use the name you just defined in Jenkins Tools
        // Note: You are currently using absolute paths for Maven, which is fine!
    }
    stages {

        stage('Build & Test') {
            steps {
                sh '/opt/homebrew/bin/mvn clean test -DsuiteXmlFile=testng.xml'      
                      }
        }
    }

   post {
        always {
            // This generates the actual visual report in the Jenkins UI
            script {
                allure includeProperties: false, 
                       jdk: '', 
                       results: [[path: 'target/allure-results']]
            }
        }
    }
}