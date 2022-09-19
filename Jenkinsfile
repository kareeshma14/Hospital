pipeline {
  agent any
  stages {
    stage ('Build&Test') {
      steps {
      	bat 'mvn clean package'
      }
  	}
  	stage ('Image') {
  	  steps {
			bat 'docker build -t kareeshma14/hospitalapp:docker .'
	  }
  	}
  	stage ('Login') {
      steps {
  	    bat 'docker login -u kareeshma14 -p Chockiee@03'
  	  }
  	}
  	stage ('Push') {
  	  steps {
		bat 'docker push kareeshma14/hospitalapp'
	}
  	}
  }
}