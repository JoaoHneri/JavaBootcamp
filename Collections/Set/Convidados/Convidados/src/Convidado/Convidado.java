package Convidado;

public class Convidado {
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nome,int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", Codigo do convidado:  " + codigoConvite;
	}
}
