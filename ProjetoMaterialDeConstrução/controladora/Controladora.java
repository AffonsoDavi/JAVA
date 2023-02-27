package controladora;

import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.*;
import visualizacao.*;

public class Controladora {

	Loja loja = new Loja();
	DecimalFormat df = new DecimalFormat("0.00");

	public void exibirMenu() {
		int opcao = 0;
		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0: // cadastrar produto
				Produto prod = new Produto();
				String descricao = EntradaSaida.solicitaDescricao();
				int qntdeProd = EntradaSaida.solicitaQtde();
				int valida = 0;	
				int codigo = 0;
				for (int i = 0; i < this.loja.getListaDeProdutos().size(); i++) {
					Produto produto = this.loja.getListaDeProdutos().get(i);
					if (produto.getDescricao().contains(descricao)) {
						valida = 1;
						codigo= (produto.getCodigo());
					}
				}
			
				if (valida == 0) {
					codigo = EntradaSaida.solicitaCodigo();
					double preco = EntradaSaida.solicitaPreco();
					prod.setCodigo(codigo);
					prod.setPreco(preco);
				}
				prod.setDescricao(descricao);
				prod.setQntdeProduto(qntdeProd);

				this.loja.cadastrarProduto(prod, descricao, codigo, qntdeProd);

				break;
			case 1: // vender produto
				if (this.loja.getListaDeProdutos().size() == 0) {
					JOptionPane.showMessageDialog(null, "Ainda não há itens na loja");
				} else {
					String[] op = new String[this.loja.getListaDeProdutos().size()];
					for (int i = 0; i < this.loja.getListaDeProdutos().size(); i++) {
						Produto produto = this.loja.getListaDeProdutos().get(i);
						op[i] = "Produto: " + produto.getDescricao() + "       " + "Código: " + produto.getCodigo();
					}
					JComboBox<String> menu = new JComboBox<String>(op);
					JOptionPane.showConfirmDialog(null, menu, "solicite a opção desejada",
							JOptionPane.OK_CANCEL_OPTION);
					int produtoEscolhido = menu.getSelectedIndex();

					String data = EntradaSaida.solicitaData();
					Produto produ = this.loja.getListaDeProdutos().get(produtoEscolhido);
					int qntdeProdVenda = 0;
					do {
						qntdeProdVenda = EntradaSaida.solicitaQtde();
						if (produ.getQntdeProduto() < qntdeProdVenda) {
							JOptionPane.showMessageDialog(null, "Não temos esta quantidade no estoque");
						}
					} while (produ.getQntdeProduto() < qntdeProdVenda);

					this.loja.venderProduto(produtoEscolhido, data, qntdeProdVenda);
				}
				break;

			case 2: // ver produtos
				String listaProd = this.loja.gerarListaEstoque();
				EntradaSaida.exibirEstoque(listaProd);
				break;

			case 3: // ver lista cupons
				String listaCupons = this.loja.gerarListaCupons();
				EntradaSaida.exibirCupons(listaCupons);
				break;

			case 4: // ver valor total cupons
				double valorTotal = this.loja.gerarValorTotal();
				EntradaSaida.exibirPrecoCupons(df.format(valorTotal));
				break;

			case 5: // sair do programa
				System.exit(0);
				break;
			}
		} while (opcao != 5);

	}
}