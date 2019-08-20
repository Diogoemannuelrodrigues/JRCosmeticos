package com.JRCosmeticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JRCosmeticos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
