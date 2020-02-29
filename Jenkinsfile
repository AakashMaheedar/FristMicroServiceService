pipeline
{
  agent none
  stages
   {
    stage('Maven Install')
     {
      agent {
        dockerfile {
          filename "Dockerfile"
                }
            }
      steps {
        sh 'docker build -f Dockerfile -t firstmicroservice.jar . '
            }
      }
   }
}