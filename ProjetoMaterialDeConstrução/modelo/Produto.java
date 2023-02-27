package modelo;

public class Produto {
	private int qntdeProduto;
	private int codigo;
	private String descricao;
	private double preco;
	
	public int getQntdeProduto() {
		return qntdeProduto;
	}
	public void setQntdeProduto(int qntdeProduto) {
		this.qntdeProduto = qntdeProduto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
