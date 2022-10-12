package br.com.fiap.checkpoint2.valorTotal;

public class valorTotal {

	private String id;
	private String dataPedido;
	private String codigoCliente;
	private String dataCadastro;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valor Totaal [id=");
		builder.append(id);
		builder.append(", dataPedido=");
		builder.append(dataPedido);
		builder.append(", codigoCliente=");
		builder.append(codigoCliente);
		builder.append(", dataCadastro=");
		builder.append(dataCadastro);
		builder.append("]");
		return builder.toString();
	}

}
