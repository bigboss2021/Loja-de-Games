package org.generation.LojaGames.repository;

import java.util.List;

import org.generation.LojaGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long > {
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String Descricao);
	
    



	
}
