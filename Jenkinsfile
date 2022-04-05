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
                bat 'mvn clean package' //thi is for windows
                //sh'mvn clean package' - this is for linux
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
               bat 'docker build -t vishwa99/test .'
            }
        }
          stage('Push docker image to Docker hub') {
            steps {
               bat 'docker login -u username -p password'
               bat 'docker push vishwa99/test'
            }
        }
    }
}
