pipeline {
  agent any

  tools {
    maven 'mvn-3.5.2'
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Make Container') {
          steps {
          sh "docker build -f Dockerfile -t firstmicroservice.jar ."

          }
        }
   }
}