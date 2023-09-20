package ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

import Convidado.Convidado;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;
	
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite){
		Convidado convidadoParaRemover = null;
		if(!convidadoSet.isEmpty()) {
			for(Convidado c : convidadoSet) {
				if(c.getCodigoConvite() == codigoConvite) {
					convidadoParaRemover = c;
					break;
				}
			}
			convidadoSet.remove(convidadoParaRemover);
		}else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
	public int retornarQuantidadeDeConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		conjuntoConvidados.adicionarConvidado("Yuta", 1);
		conjuntoConvidados.adicionarConvidado("João", 2);
		conjuntoConvidados.adicionarConvidado("Dan", 3);
		conjuntoConvidados.adicionarConvidado("Gojo", 4);
		conjuntoConvidados.adicionarConvidado("Yuji", 5);
		conjuntoConvidados.exibirConvidados();
		System.out.println(conjuntoConvidados.retornarQuantidadeDeConvidados());
		conjuntoConvidados.removerConvidadoPorCodigoConvite(4);
		conjuntoConvidados.exibirConvidados();
		System.out.println(conjuntoConvidados.retornarQuantidadeDeConvidados());
	}
}
