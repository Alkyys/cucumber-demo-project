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
            post {
                always {
                    cucumberMonochrome()
                    cucumberResults(
                        fileIncludePattern: 'target/cucumber.json',
                        trendsLimit: 10,
                        failedStepsNumber: -1,
                        skippedStepsNumber: -1,
                        undefinedStepsNumber: -1,
                        failedScenariosNumber: -1,
                        failedFeaturesNumber: -1,
                        pendingStepsNumber: -1,
                        skippedStepsNumber: -1,
                        buildStatus: 'null',
                        sortingMethod: 'ALPHABETICAL',
                        customCssFiles: '',
                        customJsFiles: ''
                    )
                }
            }
        }
    }
}