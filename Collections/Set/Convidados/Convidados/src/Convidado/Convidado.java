package Convidado;

import java.util.Objects;

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
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Convidado convidado)) return false;
		return getCodigoConvite() == convidado.getCodigoConvite();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getCodigoConvite());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", Codigo do convidado:  " + codigoConvite;
	}
}
