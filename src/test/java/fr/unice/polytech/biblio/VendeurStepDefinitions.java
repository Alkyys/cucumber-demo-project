package fr.unice.polytech.biblio;

// FR
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etantdonné;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class VendeurStepDefinitions {
    private Vendeur vendeur;
    private String informationsVendeur;

    @Etantdonné("^J'ai un vendeur avec le nom \"([^\"]*)\", l'adresse \"([^\"]*)\", l'email \"([^\"]*)\", le numéro de téléphone \"([^\"]*)\" et le salaire (\\d+\\.\\d+)$")
    public void jAiUnVendeurAvecLesInformations(String nom, String adresse, String email, String numeroTelephone, double salaire) {
        vendeur = new Vendeur(nom, adresse, email, numeroTelephone, salaire);
    }

    @Et("^J'affiche les informations du vendeur$")
    public void jAfficheLesInformationsDuVendeur() {
        informationsVendeur = vendeur.toString();
    }

    @Alors("^Les informations du vendeur affichent le nom \"([^\"]*)\", l'adresse \"([^\"]*)\", l'email \"([^\"]*)\", le numéro de téléphone \"([^\"]*)\" et le salaire (\\d+\\.\\d+)$")
    public void lesInformationsDuVendeurAffichent(String nom, String adresse, String email, String numeroTelephone, double salaire) {
        String expectedInformations = "Vendeur{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", salaire=" + salaire +
                '}';
        assertEquals(expectedInformations, informationsVendeur);
    }
}
