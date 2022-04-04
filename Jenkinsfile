pipeline {
    agent any

    stages {
        stage('Check Out') {
            steps {
                echo 'Checking Out'
            }
        }
         stage('Package') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Sonar Qube') {
            steps {
                withSonarQubeEnv("ZensarCodeAnalysis"){
                    bat 'mvn sonar:sonar'
                }
            }
        }
         stage('JaCoCo Report') {
            steps {
               jacoco()
            }
        }
          stage('Build Docker Image') {
            steps {
               echo 'Building Docker Image'
            }
        }
          stage('Push docker image to Docker hub') {
            steps {
               echo 'Pushing Docker Image'
            }
        }
    }
}
