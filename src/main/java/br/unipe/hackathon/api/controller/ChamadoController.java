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

import br.unipe.hackathon.api.model.Chamado;
import br.unipe.hackathon.api.repository.ChamadoRepository;

@RestController
@RequestMapping("api")
public class ChamadoController {
	
	@Autowired
	private ChamadoRepository profissionalRepository;
	
	@GetMapping("/chamado")
	public List<Chamado> findAll(){
		return profissionalRepository.findAll();
	}
	
	@GetMapping("chamado/{id}")
	public Optional<Chamado> findById(@PathVariable Long id) {
		return profissionalRepository.findById(id);
	}
	
	@PostMapping("/chamado")
	public Chamado saveUser(@RequestBody Chamado chamado){
		return profissionalRepository.save(chamado);
	}
	
	@DeleteMapping("chamado/{id}")
	public void deleteUser(Long id) {
		profissionalRepository.deleteById(id);
	}

	@PutMapping("/chamado")
	public Chamado updateUser(@RequestBody Chamado chamado){
		return profissionalRepository.save(chamado);
	}

}
