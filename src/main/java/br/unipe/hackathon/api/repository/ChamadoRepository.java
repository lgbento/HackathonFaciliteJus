package br.unipe.hackathon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.hackathon.api.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long>{

}
