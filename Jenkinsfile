pipeline {
  agent {
    docker {
      image 'maven:3.9.3-amazoncorretto-8-debian-bookworm'
    }
  }
  stages {
    stage('Checkout') {
      steps {
        sh 'echo passed'
        git branch: 'main', url: 'https://github.com/TrishantMaharjan/GitAndJenkinsPractice.git'
      }
    }
    stage('Build and Test') {
      steps {
        sh 'cd JavaPractice && mvn clean package'
      }
    }
  }
}
