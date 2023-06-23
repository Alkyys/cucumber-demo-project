Feature: Gestion des vendeurs

  Scenario: Affichage des informations d'un vendeur
    Etant donné J'ai un vendeur avec le nom "John Doe", l'adresse "123 rue Principale", l'email "john.doe@example.com", le numéro de téléphone "555-1234" et le salaire 5000.00
    Et J'affiche les informations du vendeur
    Alors Les informations du vendeur affichent le nom "John Doe", l'adresse "123 rue Principale", l'email "john.doe@example.com", le numéro de téléphone "555-1234" et le salaire 5000.00
