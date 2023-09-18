package CaDeCompras;

import java.util.ArrayList;
import java.util.List;

import ItensParaCarrinho.Item;

public class CarrinhoDeCompras {
	private List<Item> CarrinhoDeCompras;
	
	
public CarrinhoDeCompras() {
	this.CarrinhoDeCompras = new ArrayList<>();
}	

public void adicionarItem(String nome, double preco, int quantidade) {
	CarrinhoDeCompras.add(new Item(nome,preco,quantidade));
	System.out.println("Adicionado ao carrinho");
}

public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    if (!CarrinhoDeCompras.isEmpty()) {
      for (Item i : CarrinhoDeCompras) {
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      CarrinhoDeCompras.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

public void exibirQuantidadeDeItens() {
	System.out.println(CarrinhoDeCompras.size());
}

public void calcularValorTotal() {
	double ValorDoCarrinho = 0;
	for(Item I : CarrinhoDeCompras) {
		ValorDoCarrinho = ValorDoCarrinho + I.getPreco() * I.getQuantidade();
	}
	System.out.println(ValorDoCarrinho);
}

public void exibiItens() {
	System.out.println(CarrinhoDeCompras);
}
	

public static void main(String[] args) {
	CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
	
	carrinhoDeCompras.adicionarItem("Arroz", 3.50, 7);
	carrinhoDeCompras.adicionarItem("Frango", 8.00, 2);
	carrinhoDeCompras.exibirQuantidadeDeItens();
	carrinhoDeCompras.calcularValorTotal();
	carrinhoDeCompras.removerItem("Frango");
	carrinhoDeCompras.exibirQuantidadeDeItens();
	carrinhoDeCompras.exibiItens();

}
	
}
