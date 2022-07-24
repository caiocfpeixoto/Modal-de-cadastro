package com.mballem.demoajax.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.mballem.demoajax.domain.Usuario;
import com.mballem.demoajax.service.UsuarioService;



public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping("/salvar")
	public String salvar(Usuario usuario) {
		service.salvar(usuario);
		return "redirect:/home";
	}
}
