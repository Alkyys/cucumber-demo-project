# Projet Demo Java Cucumber 
Ce projet est une application de gestion d'une commerce, développée en Java. Il permet de gérer les produits, les clients, les commandes et les vendeurs.

## Prérequis
Avant de pouvoir exécuter l'application, assurez-vous d'avoir installé les éléments suivants :

Java Development Kit (JDK) version 11 ou supérieure
Maven (pour la gestion des dépendances)
Docker

## Installation

Clonez ce dépôt de code sur votre machine locale.
Ouvrez une console/terminal et placez-vous dans le répertoire du projet.
Exécutez la commande suivante pour compiler le projet :
```
mvn clean compile
```

Exécutez la commande suivante pour exécuter les tests et générer les rapports Cucumber :
```
mvn test
```

Les rapports Cucumber seront générés dans le répertoire target/cucumber-reports.

Si les tests se sont exécutés avec succès, vous pouvez maintenant exécuter l'application en utilisant la commande suivante :
```
mvn exec:java -Dexec.mainClass="fr.unice.polytech.biblio.Main"
```

## Scénarios de test
Des scénarios de test sont inclus dans ce projet pour vérifier le bon fonctionnement des différentes fonctionnalités de l'application. Vous pouvez trouver ces scénarios dans les fichiers *.feature situés dans le répertoire src/test/resources.

Les rapports Cucumber détaillés peuvent être consultés dans le répertoire target/cucumber-reports.

Pour exécuter uniquement les tests Cucumber, utilisez la commande suivante :
```
mvn test -Dcucumber.options="--tags @cucumber"
```

## Serveur Jenkins 
Pour lancer le serveur jenkins Dockérisé, nous allons utilisé cette commande :
```
docker container run --name jenkins --rm --detach --network jenkins --env DOCKER_HOST=tcp://docker:2376 --env DOCKER_CERT_PATH=/certs/client --env DOCKER_TLS_VERIFY=1 --publish 7070:8080 --publish 50000:50000 --volume jenkins-data:/var/jenkins_home --volume jenkins-docker-certs:/certs/client:ro jenkins/jenkins
```

Jenkins est disponible a cette adresse :
http://localhost:7070
