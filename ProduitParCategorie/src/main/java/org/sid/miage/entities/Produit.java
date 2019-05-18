package org.sid.miage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Produit implements Serializable{
	
	private static final long serialVersionUID = 5100710711012143326L;
	
	@Id @GeneratedValue
	private Long idProduit;
	@NotEmpty
	@Size(min=3,max=20)
	private String designation;
	@NotEmpty
	@Size(min=3,max=200)
	private String description;
	private double prix;
	private int quantite;
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie;

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String designation, String description, double prix, int quantite, Categorie categorie) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
}
