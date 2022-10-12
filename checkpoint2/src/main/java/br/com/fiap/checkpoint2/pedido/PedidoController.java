package br.com.fiap.checkpoint2.pedido;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint2.valorTotal.valorTotal;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@Autowired
	private PedidoMapper pedidoMapper;

	@PutMapping
	public PedidoCreationDto update(@RequestBody PedidoCreationDto pedido) {
		return pedido;
	}

	@PostMapping
	public PedidoIdDto create(@RequestBody PedidoCreationDto pedidoDto) {

		Pedido pedido = pedidoMapper.toUser(pedidoDto);

		for (String valorTotalString : pedidoDto.getValorTotal()) {

			valorTotal valorTotal = new valorTotal();
			valorTotal.setId(UUID.randomUUID().toString());
			valorTotal.setDataPedido(valorTotalString);
			valorTotal.setCodigoCliente(valorTotalString);
			valorTotal.setDataCadastro(valorTotalString);

			pedido.addValorTotal(valorTotal);

		}

		Pedido newUser = pedidoService.add(pedido);

		return new PedidoIdDto(newUser.getId());
	}

	@GetMapping
	public Pedido get() {
		return new Pedido("Novo Pedido", "12/10/2022", "85312");
	}
}
