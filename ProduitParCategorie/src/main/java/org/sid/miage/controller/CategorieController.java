package org.sid.miage.controller;

import org.sid.miage.dao.CategorieRepository;
import org.sid.miage.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategorieController {
	@Autowired
	private CategorieRepository categorieRepository;
	
	@RequestMapping(value="/categories")
	public String consulter(Model model,
			String mc){
		//Page<Categorie> listCategories = categorieRepository.chercher("%"+mc+"%",new PageRequest(0, 2));
		Page<Categorie> listCategories = categorieRepository.findAll(new PageRequest(1,2));
		model.addAttribute("listCategories",listCategories);
		return "administrateur/categories";
	}
}
