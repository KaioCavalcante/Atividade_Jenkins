pipeline {
    agent any

    triggers {
        cron('20 55 * * *')
    }

    tools {
        maven 'Maven3'
        jdk 'JDK25'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Teste') {
            steps {
                bat 'mvn test -Dmaven.test.failure.ignore=true'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            recordCoverage(tools: [[parser: 'JACOCO']])
        }
    }
}
