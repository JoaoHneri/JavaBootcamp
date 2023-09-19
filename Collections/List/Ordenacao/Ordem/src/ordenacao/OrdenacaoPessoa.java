package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList = new ArrayList<>();
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> listaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(listaPorAltura, new ComparatorPorAltura());
		return listaPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("João", 19, 1.79 );
		ordenacaoPessoa.adicionarPessoa("Diego", 19, 1.75 );
		ordenacaoPessoa.adicionarPessoa("Mateus", 21, 1.69 );
		ordenacaoPessoa.adicionarPessoa("Lucas", 20, 1.79 );
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
	
}
