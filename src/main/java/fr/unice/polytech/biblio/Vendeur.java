package fr.unice.polytech.biblio;

public class Vendeur {
    private String nom;
    private String adresse;
    private String email;
    private String numeroTelephone;
    private double salaire;

    public Vendeur(String nom, String adresse, String email, String numeroTelephone, double salaire) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
        this.salaire = salaire;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    // Méthode toString pour afficher les informations du vendeur

    @Override
    public String toString() {
        return "Vendeur{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

