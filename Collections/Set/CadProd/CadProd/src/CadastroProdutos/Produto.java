package CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private String nome;
	private double preco;
	private int quantidade;
	private long codigo;
	
	public Produto(String nome, double preco, int quantidade, long codigo) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigo = codigo;
	}
	
	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}


	public String getNome() {
		return nome;
	}


	public double getPreco() {
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public long getCodigo() {
		return codigo;
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", codigo=" + codigo + "]";
	}
	
}

class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
	
}
