package fr.unice.polytech.biblio;

// FR
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etantdonné;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CommandeStepDefinitions {
    private Commande commande;
    private BigDecimal totalResult;

    @Etantdonné("J'ai une commande vide")
    public void jAiUneCommandeVide() {
        commande = new Commande();
    }

    @Et("J'ajoute un produit avec le prix {double} à la commande")
    public void jAjouteUnProduitAvecLePrixALaCommande(double prix) {
        Produit produit = new Produit(1, "P001", "Produit 1", prix);
        commande.add(produit);
    }

    @Alors("Le total de la commande est {double}")
    public void leTotalDeLaCommandeEst(BigDecimal expectedTotal) {
        totalResult = commande.getTotal();
        assertEquals(expectedTotal, totalResult);
    }
}
