pipeline
{
  agent none
  stages
   {
    stage('Maven Install')
     {
      agent {
        docker {
          filename "Dockerfile"
                }
            }
      steps {
        sh 'mvn clean install'
            }
      }
   }
}