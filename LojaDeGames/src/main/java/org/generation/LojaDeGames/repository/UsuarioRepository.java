package org.generation.LojaDeGames.repository;

import java.util.List;

import org.generation.LojaDeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<UsuarioRepository> findAllByNomeCompletoContainingIgnoreCase( String nomeCompleto);
}