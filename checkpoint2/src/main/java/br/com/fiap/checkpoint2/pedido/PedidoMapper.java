package br.com.fiap.checkpoint2.pedido;

import org.springframework.stereotype.Component;

@Component
public class PedidoMapper {

	public Pedido toUser(PedidoCreationDto dto) {
		return new Pedido(dto.getDataPedido(), dto.getCodigoCliente(), dto.getDataCadastro());
	}
}
