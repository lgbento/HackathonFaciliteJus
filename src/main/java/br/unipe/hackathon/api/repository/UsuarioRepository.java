package br.unipe.hackathon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.hackathon.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
