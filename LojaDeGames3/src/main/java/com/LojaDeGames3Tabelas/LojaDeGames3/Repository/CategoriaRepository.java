package com.LojaDeGames3Tabelas.LojaDeGames3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames3Tabelas.LojaDeGames3.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByCategoriaContainingIgnoreCase (String categoria);
	
}
