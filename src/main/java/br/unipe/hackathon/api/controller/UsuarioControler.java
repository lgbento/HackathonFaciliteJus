package br.unipe.hackathon.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unipe.hackathon.api.model.Usuario;
import br.unipe.hackathon.api.repository.UsuarioRepository;

@RestController
@RequestMapping("api")
public class UsuarioControler {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuario")
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("usuario/{id}")
	public Optional<Usuario> findById(@PathVariable Long id) {
		return usuarioRepository.findById(id);
	}
	
	@PostMapping("/usuario")
	public Usuario saveUser(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping("usuario/{id}")
	public void deleteUser(Long id) {
		 usuarioRepository.deleteById(id);
	}

	@PutMapping("/usuario")
	public Usuario updateUser(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
}
