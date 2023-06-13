Feature: Gestion des produits

  Scenario: Création d'un produit
    Given un produit avec id 1, le code "P001", le libellé "Produit 1" et le prix 10.99
    When j'obtiens l'id du produit
    Then l'id du produit est 1

    When j'obtiens le code du produit
    Then le code du produit est "P001"

    When j'obtiens le libellé du produit
    Then le libellé du produit est "Produit 1"

    When j'obtiens le prix du produit
    Then le prix du produit est 10.99
