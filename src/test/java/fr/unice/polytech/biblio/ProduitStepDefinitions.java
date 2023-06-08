package fr.unice.polytech.biblio;

// EN
// import cucumber.api.java.en.Given;
// import cucumber.api.java.en.Then;
// import cucumber.api.java.en.When;

// FR
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etantdonné;
// import io.cucumber.java.fr.Quand;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ProduitStepDefinitions {
    private Produit produit;
    private Integer idResult;
    private String codeResult;
    private String libelleResult;
    private BigDecimal prixResult;

    @Etantdonné("un produit avec id (\\d+), le code \"([^\"]*)\", le libellé \"([^\"]*)\" et le prix (\\d+(\\.\\d+)?)")
    public void unProduitAvecIdCodeLibelleEtPrix(int id, String code, String libelle, double prix) {
        produit = new Produit(id, code, libelle, prix);
    }

    @Et("j'obtiens l'id du produit")
    public void obtenirIdProduit() {
        idResult = produit.getId();
    }

    @Alors("l'id du produit est (\\d+)")
    public void verifierIdProduit(Integer expectedId) {
        assertEquals(expectedId, idResult);
    }

    @Et("j'obtiens le code du produit")
    public void obtenirCodeProduit() {
        codeResult = produit.getCode();
    }

    @Alors("le code du produit est \"([^\"]*)\"")
    public void verifierCodeProduit(String expectedCode) {
        assertEquals(expectedCode, codeResult);
    }

    @Et("j'obtiens le libellé du produit")
    public void obtenirLibelleProduit() {
        libelleResult = produit.getLibelle();
    }

    @Alors("le libellé du produit est \"([^\"]*)\"")
    public void verifierLibelleProduit(String expectedLibelle) {
        assertEquals(expectedLibelle, libelleResult);
    }

    @Et("j'obtiens le prix du produit")
    public void obtenirPrixProduit() {
        prixResult = produit.getPrix();
    }

    @Alors("le prix du produit est ([-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?)")
    public void verifierPrixProduit(double expectedPrix) {
        assertEquals(BigDecimal.valueOf(expectedPrix), prixResult);
    }
}