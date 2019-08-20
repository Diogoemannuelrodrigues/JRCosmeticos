package com.JRCosmeticos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.JRCosmeticos.model.Pedido;
import com.JRCosmeticos.repository.PedidoRepository;

public class PedidoResource {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public List<Pedido> listarPedidos() {
		return pedidoRepository.findAll();
	}


}
