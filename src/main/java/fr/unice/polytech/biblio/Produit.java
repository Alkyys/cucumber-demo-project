package fr.unice.polytech.biblio;

import java.math.BigDecimal;

public class Produit {

	private int id;
	private String code;
	private String libelle;
	private BigDecimal prix;
	
	public Produit(int id, String code, String libelle, BigDecimal prix) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public Produit(int id, String code, String libelle, double prix) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = BigDecimal.valueOf(prix);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public static Produit unProduitAvecIdCodeLibelleEtPrix(int id, String code, String libelle, double prix) {
        BigDecimal prixDecimal = BigDecimal.valueOf(prix);
        return new Produit(id, code, libelle, prixDecimal);
    }

	// Méthodes pour obtenir et vérifier l'id du produit

    public int obtenirIdProduit() {
        return id;
    }

    public void verifierIdProduit(int expectedId) {
        if (id != expectedId) {
            throw new AssertionError("L'id du produit ne correspond pas à la valeur attendue.");
        }
    }

    // Méthodes pour obtenir et vérifier le code du produit

    public String obtenirCodeProduit() {
        return code;
    }

    public void verifierCodeProduit(String expectedCode) {
        if (!code.equals(expectedCode)) {
            throw new AssertionError("Le code du produit ne correspond pas à la valeur attendue.");
        }
    }

    // Méthodes pour obtenir et vérifier le libellé du produit

    public String obtenirLibelleProduit() {
        return libelle;
    }

    public void verifierLibelleProduit(String expectedLibelle) {
        if (!libelle.equals(expectedLibelle)) {
            throw new AssertionError("Le libellé du produit ne correspond pas à la valeur attendue.");
        }
    }

    // Méthodes pour obtenir et vérifier le prix du produit

    public BigDecimal obtenirPrixProduit() {
        return prix;
    }

    public void verifierPrixProduit(BigDecimal expectedPrix) {
        if (!prix.equals(expectedPrix)) {
            throw new AssertionError("Le prix du produit ne correspond pas à la valeur attendue.");
        }
    }

}
