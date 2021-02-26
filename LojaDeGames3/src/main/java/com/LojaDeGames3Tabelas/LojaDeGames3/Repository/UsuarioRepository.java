package com.LojaDeGames3Tabelas.LojaDeGames3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames3Tabelas.LojaDeGames3.Model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public List<Usuario> findAllBynomeContainingIgnoreCase (String nome);

}
