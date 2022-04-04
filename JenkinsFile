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
         stage('JaCoCo Report') {
            steps {
               jacoco()
            }
        }
    }
}
