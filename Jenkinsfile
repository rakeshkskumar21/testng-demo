pipeline {
    agent any

    stages {

        stage('Build & Test') {
            steps {
                sh '/opt/homebrew/bin/mvn clean test -Dsurefire.suiteXmlFiles=testng.xml'
            }
        }
    }

   post {
        always {
            // allowEmptyResults: true prevents the "No test report files" crash
            // if the build failed before tests could run.
            junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
        }
    }
}