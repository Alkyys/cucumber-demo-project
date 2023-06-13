pipeline {
    agent any
    tools {
    maven 'Maven'
  }
    stages {
        stage('Build') {
            steps {
                sh 'mvn --version'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            
        }
        stage('Generate HTML report') {
        cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'My report',
                fileIncludePattern: '**/*.json',
                trendsLimit: 10,
                classifications: [
                    [
                        'key': 'Browser',
                        'value': 'Firefox'
                    ]
                ]
    }
    }
}