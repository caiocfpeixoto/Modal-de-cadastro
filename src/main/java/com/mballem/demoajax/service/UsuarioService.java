package com.mballem.demoajax.service;

import java.util.List;

import com.mballem.demoajax.domain.Usuario;

public interface UsuarioService {
	
	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	Usuario buscarporId(Long id);
	
	List<Usuario> buscarTodos();
}
