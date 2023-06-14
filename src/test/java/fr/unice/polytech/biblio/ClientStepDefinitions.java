package fr.unice.polytech.biblio;

// FR
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Quand;

import static org.junit.Assert.assertEquals;

public class ClientStepDefinitions {
    private Client client;
    private String nomResult;
    private String adresseResult;
    private String emailResult;
    private String numeroTelephoneResult;

    @Etantdonné("J'ai un client avec le nom {string}, l'adresse {string}, l'email {string} et le numéro de téléphone {string}")
    public void jAiUnClientAvecLeNomLAdresseLEmailEtLeNuméroDeTéléphone(String nom, String adresse, String email, String numeroTelephone) {
        client = new Client(nom, adresse, email, numeroTelephone);
    }

    @Quand("J'obtiens le nom du client")
    public void jObtiensLeNomDuClient() {
        nomResult = client.getNom();
    }

    @Alors("Le nom du client est {string}")
    public void leNomDuClientEst(String expectedNom) {
        assertEquals(expectedNom, nomResult);
    }

    @Quand("J'obtiens l'adresse du client")
    public void jObtiensLAdresseDuClient() {
        adresseResult = client.getAdresse();
    }

    @Alors("L'adresse du client est {string}")
    public void lAdresseDuClientEst(String expectedAdresse) {
        assertEquals(expectedAdresse, adresseResult);
    }

    @Quand("J'obtiens l'email du client")
    public void jObtiensLEmailDuClient() {
        emailResult = client.getEmail();
    }

    @Alors("L'email du client est {string}")
    public void lEmailDuClientEst(String expectedEmail) {
        assertEquals(expectedEmail, emailResult);
    }

    @Quand("J'obtiens le numéro de téléphone du client")
    public void jObtiensLeNuméroDeTéléphoneDuClient() {
        numeroTelephoneResult = client.getNumeroTelephone();
    }

    @Alors("Le numéro de téléphone du client est {string}")
    public void leNuméroDeTéléphoneDuClientEst(String expectedNumeroTelephone) {
        assertEquals(expectedNumeroTelephone, numeroTelephoneResult);
    }
}
