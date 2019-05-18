package org.sid.miage.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Categorie implements Serializable{
	
	private static final long serialVersionUID = -4450000716392412084L;
	
	@Id @GeneratedValue
	private Long idCategorie;
	@NotEmpty
	@Size(min=3,max=20)
	private String nomCategorie;
	@NotEmpty
	@Size(min=3,max=200)
	private String description;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateTime;
	
	@OneToMany(mappedBy="categorie", fetch=FetchType.LAZY)
	private Collection<Produit> produits;
	
	public Categorie() {
		super();
	}

	public Categorie(String nomCategorie, String description, Date dateTime) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.dateTime = dateTime;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", description="
				+ description + ", dateTime=" + dateTime + "]";
	}

}
