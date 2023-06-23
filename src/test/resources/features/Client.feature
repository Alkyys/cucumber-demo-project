Feature: Gestion des clients
  Scenario: Création d'un client
    Etant donné J'ai un client avec le nom "John Doe", l'adresse "123 Rue du Client", l'email "john.doe@example.com" et le numéro de téléphone "1234567890"
    Quand J'obtiens le nom du client
    Alors Le nom du client est "John Doe"

    Et J'obtiens l'adresse du client
    Alors L'adresse du client est "123 Rue du Client"

    Et J'obtiens l'email du client
    Alors L'email du client est "john.doe@example.com"

    Et J'obtiens le numéro de téléphone du client
    Alors Le numéro de téléphone du client est "1234567890"
