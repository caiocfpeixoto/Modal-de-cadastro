package com.mballem.demoajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.demoajax.dao.UsuarioDao;
import com.mballem.demoajax.domain.Usuario;

@Service @Transactional(readOnly = false)
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDao dao;
	
	@Override
	public void salvar(Usuario usuario) {
		dao.save(usuario);
	}

	@Override
	public void editar(Usuario usuario) {
		dao.update(usuario);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Usuario buscarporId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Usuario> buscarTodos() {
		return dao.findAll();
	}

}
