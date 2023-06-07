package com.demo.model;

public class Client {
    private String nom;
    private String adresse;
    private String email;
    private String numeroTelephone;

    public Client(String nom, String adresse, String email, String numeroTelephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
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

    // Méthode toString pour afficher les informations du client

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                '}';
    }
}
