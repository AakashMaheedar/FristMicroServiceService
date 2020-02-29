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
        sh 'docker build -f Dockerfile -t firstmicroservice.jar . '
            }
      }
   }
}