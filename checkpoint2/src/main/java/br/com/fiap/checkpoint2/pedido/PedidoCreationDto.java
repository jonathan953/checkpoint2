package br.com.fiap.checkpoint2.pedido;

import java.util.List;

import br.com.fiap.checkpoint2.valorTotal.valorTotal;

public class PedidoCreationDto {

	private String id;
	private String dataPedido;
	private String codigoCliente;
	private String dataCadastro;
	private String valorTotal;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String[] getValorTotal() {
		return getValorTotal();
	}

}
