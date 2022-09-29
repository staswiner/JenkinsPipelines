def call() {
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World this is a custom pipeline'
            }
        }
    }
}
}