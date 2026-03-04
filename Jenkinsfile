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
            junit 'target/surefire-reports/*.xml'
        }
    }
}