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
        stage('Generate JSON report') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="net.masterthought.cucumber.ReportBuilder" -Dexec.args="--json-file ./src/report --output-directory ./src/report" '
            }
        }
        stage('Generate HTML report') {
            steps {
                cucumber buildStatus: 'UNSTABLE',
                        reportTitle: 'My report',
                        fileIncludePattern: '**/*.json',
                         fileExcludePattern: '**/.vscode/**', // Exclude .vscode folder
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
}