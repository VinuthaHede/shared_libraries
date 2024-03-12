def call(){
  echo "Deploying the artifact"
  sh '''ls -lrt
        mvn clean install
      '''
}
