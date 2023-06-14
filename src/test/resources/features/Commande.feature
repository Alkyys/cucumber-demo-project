Feature: Gestion des commandes
  Scenario: Calcul du total de la commande
    Etant donné J'ai une commande vide
    Quand J'ajoute un produit avec le prix 10.99 à la commande
    Alors Le total de la commande est 10.99

    Et J'ajoute un produit avec le prix 5.99 à la commande
    Alors Le total de la commande est 16.98
