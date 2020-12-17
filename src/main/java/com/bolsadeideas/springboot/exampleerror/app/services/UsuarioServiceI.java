package com.bolsadeideas.springboot.exampleerror.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.exampleerror.app.models.domain.Usuario;

@Service
public class UsuarioServiceI implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceI() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Andrés", "Guzmán"));
		this.lista.add(new Usuario(2, "Pepa", "García"));
		this.lista.add(new Usuario(3, "Lalo", "Mena"));
		this.lista.add(new Usuario(4, "Luci", "Fernández"));
		this.lista.add(new Usuario(5, "Pato", "González"));
		this.lista.add(new Usuario(6, "Paco", "Rodríguez"));
		this.lista.add(new Usuario(7, "Juan", "Gómez"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u : this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

//	@Override
//	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
//		Usuario usuario = this.obtenerPorId(id);
//		return Optional.ofNullable(usuario);
//	}

}
