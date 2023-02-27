package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Loja {
	private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
	private ArrayList<Cupons> listaDeCupons = new ArrayList<Cupons>();

	public ArrayList<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public ArrayList<Cupons> getListaDeCupons() {
		return listaDeCupons;
	}

	public void setListaDeCupons(ArrayList<Cupons> listaDeCupons) {
		this.listaDeCupons = listaDeCupons;
	}

	public void cadastrarProduto(Produto prod, String descricao, int codigo, int qntdeProd) {
		if (this.listaDeProdutos.size() == 0) {
			this.listaDeProdutos.add(prod);
		} else {
			int valida = 0;
			for (int i = 0; i < listaDeProdutos.size(); i++) {
				Produto produto = listaDeProdutos.get(i);
				if ((produto.getDescricao().contains(descricao)) && (produto.getCodigo() != codigo)) {
					JOptionPane.showMessageDialog(null, "O código do seu produto não bate com o já cadastrado");
					valida = 1;

				} else if ((!produto.getDescricao().contains(descricao)) && (produto.getCodigo() == codigo)) {

					JOptionPane.showMessageDialog(null, "O código do seu produto já esta cadastrado!");
					valida = 1;
				} else if ((produto.getDescricao().contains(descricao)) && (produto.getCodigo() == codigo)) {

					int total = produto.getQntdeProduto() + qntdeProd;
					produto.setQntdeProduto(total);
					valida = 1;
				}
			}
			if (valida == 0) {
				this.listaDeProdutos.add(prod);
			}
		}
	}

	public void venderProduto(int produtoEscolhido, String data, int qntdeProdVenda) {
		if (this.listaDeProdutos.size() == 0) {
			JOptionPane.showMessageDialog(null, "Ainda não há itens na loja");
		} else {
			Cupons cupom = new Cupons();
			Produto prod = listaDeProdutos.get(produtoEscolhido);

			double precoTotal = prod.getPreco() * qntdeProdVenda;
			cupom.setDataVenda(data);
			cupom.setDescricaoProduto(prod.getDescricao());
			cupom.setQtdeVenda(qntdeProdVenda);
			cupom.setValor(precoTotal);

			if (prod.getQntdeProduto() == qntdeProdVenda) {
				this.listaDeProdutos.remove(prod);
			} else {
				prod.setQntdeProduto(prod.getQntdeProduto() - qntdeProdVenda);
			}
			this.listaDeCupons.add(cupom);
		}
	}

	public String gerarListaEstoque() {
		String listaInfo = "";
		if (this.listaDeProdutos.size() == 0) {
			listaInfo = "Ainda não há itens na loja";
		} else {

			for (int i = 0; i < listaDeProdutos.size(); i++) {
				Produto produto = listaDeProdutos.get(i);
				listaInfo += "\n*******************************" + "\nDescrição: " + produto.getDescricao()
						+ "\nQuantidade: " + produto.getQntdeProduto() + "\nCódigo: " + produto.getCodigo()
						+ "\nPreço: " + produto.getPreco() + "\n*******************************";
			}

		}
		return listaInfo;
	}

	public String gerarListaCupons() {
		String listaInfo = "";
		if (this.listaDeCupons.size() == 0) {
			listaInfo = "Ainda não há itens na loja";
		} else {
			for (int i = 0; i < listaDeCupons.size(); i++) {
				Cupons cupom = listaDeCupons.get(i);
				listaInfo += "\n*******************************" + "\nDescrição: " + cupom.getDescricaoProduto()
						+ "\nQuantidade: " + cupom.getQtdeVenda() + "\nData da venda: " + cupom.getDataVenda()
						+ "\nValor : " + cupom.getValor() + "\n*******************************";
			}
		}
		return listaInfo;

	}

	public double gerarValorTotal() {
		double valorTotal = 0;
		for (int i = 0; i < listaDeCupons.size(); i++) {
			Cupons cup = listaDeCupons.get(i);
			valorTotal += cup.getValor();
		}
		return valorTotal;
	}

}
