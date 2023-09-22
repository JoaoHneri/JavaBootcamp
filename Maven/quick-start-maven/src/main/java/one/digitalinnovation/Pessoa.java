package one.digitalinnovation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	private String nome;
	
	private LocalDate nascimento;

	public Pessoa(String nome, LocalDate localDate) {
		super();
		this.nome = nome;
		this.nascimento = localDate;
	}

	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
	}

	public boolean ehMaiorDeIdade() {
		return getIdade() >= 18;
	}
	
	
	
	
}
