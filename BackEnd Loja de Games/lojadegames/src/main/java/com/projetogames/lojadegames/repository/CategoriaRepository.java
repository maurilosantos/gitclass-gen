package com.projetogames.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.projetogames.lojadegames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	   public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

	}
