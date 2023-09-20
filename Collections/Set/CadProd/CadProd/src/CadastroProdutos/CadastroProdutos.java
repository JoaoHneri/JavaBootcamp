package CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet = new HashSet<>();
	
public CadastroProdutos() {
	this.produtoSet = new HashSet<Produto>();
}	


public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
	produtoSet.add(new Produto(nome, preco, quantidade, cod));
}

public Set<Produto> exibirPorNome(){
	Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
	return produtosPorNome;
}

public Set<Produto> exibirProdutosPorPreco(){
	Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
	produtosPorPreco.addAll(produtoSet);
	return produtosPorPreco;
}

public static void main(String[] args) {
	CadastroProdutos cadastroProdutos = new CadastroProdutos();


    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

    System.out.println(cadastroProdutos.produtoSet);


    System.out.println(cadastroProdutos.exibirPorNome());


    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
}

}
