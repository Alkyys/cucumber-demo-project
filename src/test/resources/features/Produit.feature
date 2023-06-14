Feature: Gestion des produits

  Scenario: Création d'un produit
    Etant donné un produit avec id 1, le code "P001", le libellé "Produit 1" et le prix 10.99
    Et j'obtiens l'id du produit
    Alors l'id du produit est 1

    Et j'obtiens le code du produit
    Alors le code du produit est "P001"

    Et j'obtiens le libellé du produit
    Alors le libellé du produit est "Produit 1"

    Et j'obtiens le prix du produit
    Alors le prix du produit est 10.99
