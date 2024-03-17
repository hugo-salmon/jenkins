pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Exécutez les commandes de build ici.
		// Changer le répertoire de Maven
                sh '/opt/homebrew/Cellar/maven/3.9.6/bin/mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Exécutez les tests
		// Changer le répertoire de Maven
                sh '/Users/estherchabi/apache-maven-3.9.6/bin/mvn test'
            }
        }

    }
    post {
        success {
            // Actions à effectuer en cas de succès du pipeline
            echo 'Le pipeline a réussi!'
        }
        failure {
            // Actions à effectuer en cas d'échec du pipeline
            echo 'Le pipeline a échoué. Vérifiez les logs pour plus d\'informations.'
        }
    }
}
