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
    stage('Make Container')
        agent (docker true)
     {
          steps {
          sh 'docker run '

          }
        }
   }
}