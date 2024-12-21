pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/yogeshjanrao/codetech-task-1.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'  // Adjust based on your build tool (Maven, Gradle, etc.)
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Docker Build and Deploy') {
             steps {
                script {
                      // Build a Docker image
                      sh '''
                      docker build -t codetech-task-1:latest .
                      '''

                      // Stop and remove any existing container (if necessary)
                      sh '''
                      docker stop codetech-task-1 || true
                      docker rm codetech-task-1 || true
                      '''

                      // Run the Docker container
                      sh '''
                      docker run -d --name codetech-task-1 -p 8081:8081 codetech-task-1:latest
                      '''
                }
             }
        }

    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            junit 'target/surefire-reports/*.xml'
        }
    }
}
