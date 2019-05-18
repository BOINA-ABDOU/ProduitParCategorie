package org.sid.miage.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Contact implements Serializable{
	
	private static final long serialVersionUID = 8987685693416889845L;
	
	@Id
	@GeneratedValue
	private Long idContact;
	@NotEmpty
	@Size(min=5,max=25)
	private String sujet;
	@NotEmpty
	@Size(min=5,max=30)
	@Email
	private String email;
	@NotEmpty
	@Size(min=5,max=200)
	private String message;
	
	public Contact() {
		super();
	}

	public Contact(String sujet, String email, String message) {
		super();
		this.sujet = sujet;
		this.email = email;
		this.message = message;
	}

	public Long getIdContact() {
		return idContact;
	}

	public void setIdContact(Long idContact) {
		this.idContact = idContact;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
