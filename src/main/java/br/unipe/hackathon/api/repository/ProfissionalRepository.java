package br.unipe.hackathon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.hackathon.api.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{

	
}
