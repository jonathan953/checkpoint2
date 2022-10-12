package br.com.fiap.checkpoint2.pedido;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

	public Pedido add(Pedido pedido) {
		pedido.setId(UUID.randomUUID().toString());
		return pedido;
	}
}
