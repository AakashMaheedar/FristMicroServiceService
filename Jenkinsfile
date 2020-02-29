pipeline {
  agent any

  tools {
    maven 'Maven'
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Make Container') {
          steps {
          sh 'docker.Build("-t firstmicroservice.jar .") '

          }
        }
   }
}