pipeline {
    agent any
    tools {
        // Use the name you just defined in Jenkins Tools
        allure 'allure-latest'
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
            // This generates the actual visual report
            allure includeProperties: false, 
                   jdk: '', 
                   results: [[path: 'target/allure-results']]
            
            // Keeping your JUnit results as well for the Jenkins trend graph
            junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
        }
    }
}