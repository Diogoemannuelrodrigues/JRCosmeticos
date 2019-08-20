package com.JRCosmeticos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JRCosmeticos.model.Produto;
import com.JRCosmeticos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}

}
