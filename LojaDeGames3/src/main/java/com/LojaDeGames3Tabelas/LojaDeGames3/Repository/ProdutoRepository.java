package com.LojaDeGames3Tabelas.LojaDeGames3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames3Tabelas.LojaDeGames3.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByProdutoDescricaoContainingIgnoreCase (String produtoDescricao);
}
