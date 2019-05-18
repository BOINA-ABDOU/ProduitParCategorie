package org.sid.miage;

import java.util.Date;

import org.sid.miage.dao.CategorieRepository;
import org.sid.miage.dao.ContactRepository;
import org.sid.miage.dao.ProduitRepository;
import org.sid.miage.entities.Categorie;
import org.sid.miage.entities.Contact;
import org.sid.miage.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProduitParCategorieApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ProduitParCategorieApplication.class, args);
		/*CategorieRepository categorieRepository = ctx.getBean(CategorieRepository.class);
		Categorie c1 = categorieRepository.save(new Categorie("Ordinateurs", "Ordinateurs", new Date()));
		Categorie c2 = categorieRepository.save(new Categorie("Imprimantes", "Imprimantes", new Date()));
		Categorie c3 = categorieRepository.save(new Categorie("Logiciels", "Logiciels", new Date()));
		
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("HP4208", "HP4208", 800, 10, c1));
		produitRepository.save(new Produit("ASUS405", "ASUS405", 1200, 5, c1));
		produitRepository.save(new Produit("Epson502", "Epson502", 100, 5, c2));
		produitRepository.save(new Produit("Panier1001", "Panier1001", 50, 5, c3));
		*/
		/*ContactRepository contactRepository = ctx.getBean(ContactRepository.class);
		contactRepository.save(new Contact("Consernant notre sortie","younes@gmail.com","BGETRERRERRE A bientot"));
		contactRepository.save(new Contact("Consernant notre sortie","younes@gmail.com","BGETRERRERRE A bientot"));
		contactRepository.save(new Contact("Consernant notre sortie","younes@gmail.com","BGETRERRERRE A bientot"));
		*/
		
	}

}
