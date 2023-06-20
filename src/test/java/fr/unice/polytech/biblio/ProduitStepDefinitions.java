package fr.unice.polytech.biblio;

// FR
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etantdonné;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProduitStepDefinitions {
    private Produit produit;
    private Integer idResult;
    private String codeResult;
    private String libelleResult;
    private BigDecimal prixResult;

    @Etantdonné("un produit avec id {int}, le code {string}, le libellé {string} et le prix {double}")
    public void unProduitAvecIdCodeLibelleEtPrix(int id, String code, String libelle, double prix) {
        produit = new Produit(id, code, libelle, prix);
    }

    @Et("j'obtiens l'id du produit")
    public void obtenirIdProduit() {
        idResult = produit.getId();
    }

    @Alors("l'id du produit est {int}")
    public void verifierIdProduit(Integer expectedId) {
        assertEquals(expectedId, idResult);
    }

    @Et("j'obtiens le code du produit")
    public void obtenirCodeProduit() {
        codeResult = produit.getCode();
    }

    @Alors("le code du produit est {string}")
    public void verifierCodeProduit(String expectedCode) {
        assertEquals(expectedCode, codeResult);
    }

    @Et("j'obtiens le libellé du produit")
    public void obtenirLibelleProduit() {
        libelleResult = produit.getLibelle();
    }

    @Alors("le libellé du produit est {string}")
    public void verifierLibelleProduit(String expectedLibelle) {
        assertEquals(expectedLibelle, libelleResult);
    }

    @Et("j'obtiens le prix du produit")
    public void obtenirPrixProduit() {
        prixResult = produit.getPrix();
    }

    @Alors("le prix du produit est {double}")
    public void verifierPrixProduit(double expectedPrix) {
        assertEquals(BigDecimal.valueOf(expectedPrix), prixResult);
    }
}