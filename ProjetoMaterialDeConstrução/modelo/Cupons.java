package modelo;

public class Cupons {

	private String dataVenda;
	private String descricaoProduto;
	private int qtdeVenda;
	private double valor;
	
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public int getQtdeVenda() {
		return qtdeVenda;
	}
	public void setQtdeVenda(int qtdeVenda) {
		this.qtdeVenda = qtdeVenda;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valorTotal) {
		this.valor= valorTotal;
	}
	
}
