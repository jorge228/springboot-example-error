package com.bolsadeideas.springboot.exampleerror.app.services;

import java.util.List;

import com.bolsadeideas.springboot.exampleerror.app.models.domain.Usuario;

public interface UsuarioService {
	
	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
//	public Optional<Usuario> obtenerPorIdOptional(Integer id);

}