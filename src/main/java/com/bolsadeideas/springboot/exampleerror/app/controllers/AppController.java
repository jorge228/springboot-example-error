package com.bolsadeideas.springboot.exampleerror.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.exampleerror.app.errors.UsuarioNiEncontradoException;
import com.bolsadeideas.springboot.exampleerror.app.models.domain.Usuario;
import com.bolsadeideas.springboot.exampleerror.app.services.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;

	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
//		error aritmética
//		Integer valor = 100/0;
		Integer valor = Integer.parseInt("10xaaa");
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
//		Usuario usuario  = usuarioService.obtenerPorId(id);
		
		/*if(usuario==null) {
			throw new UsuarioNiEncontradoException(id.toString());
		}*/
		
		Usuario usuario  = usuarioService.obtenerPorIdOptional(id).orElseThrow(() -> new UsuarioNiEncontradoException(id.toString()));
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle usuario: ".concat(usuario.getNombre()));
		return "ver";
	}
}
