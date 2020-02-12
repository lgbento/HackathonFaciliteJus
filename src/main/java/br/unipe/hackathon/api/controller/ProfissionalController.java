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

import br.unipe.hackathon.api.model.Profissional;
import br.unipe.hackathon.api.repository.ProfissionalRepository;

@RestController
@RequestMapping("api")
public class ProfissionalController {

	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	@GetMapping("/profissional")
	public List<Profissional> findAll(){
		return profissionalRepository.findAll();
	}
	
	@GetMapping("profissional/{id}")
	public Optional<Profissional> findById(@PathVariable Long id) {
		return profissionalRepository.findById(id);
	}
	
	@PostMapping("/profissional")
	public Profissional saveUser(@RequestBody Profissional profissional){
		return profissionalRepository.save(profissional);
	}
	
	@DeleteMapping("profissional/{id}")
	public void deleteUser(Long id) {
		profissionalRepository.deleteById(id);
	}

	@PutMapping("/profissional")
	public Profissional updateUser(@RequestBody Profissional profissional){
		return profissionalRepository.save(profissional);
	}
	
}
