package br.com.fiap.checkpoint2.pedido;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint2.valorTotal.valorTotal;

public class Pedido {

	private String id;
	private String dataPedido;
	private String codigoCliente;
	private String dataCadastro;
	private List<valorTotal> valorTotal;

	public Pedido(String dataPedido, String codigoCliente, String dataCadastro) {
		this.dataPedido = dataPedido;
		this.codigoCliente = codigoCliente;
		this.dataCadastro = dataCadastro;
	}

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

	public List<valorTotal> getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(List<valorTotal> valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void addValorTotal(valorTotal valorTotal) {
		if (this.valorTotal == null)
			this.valorTotal = new ArrayList<valorTotal>();

		this.valorTotal.add(valorTotal);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [id=");
		builder.append(id);
		builder.append(", dataPedido=");
		builder.append(dataPedido);
		builder.append(", codigoCliente=");
		builder.append(codigoCliente);
		builder.append(", dataCadastro=");
		builder.append(dataCadastro);
		builder.append(", valorTotal=");
		builder.append(valorTotal);
		builder.append("]");
		return builder.toString();
	}

}
