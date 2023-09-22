package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste{
	@Test
	void calcularIdadeCorreta() {
		Pessoa jessica = new Pessoa("jessica", LocalDate.of(2004, 1, 1));
		Assertions.assertEquals(19, jessica.getIdade());
	}
	
	@Test
	void seEhMaiorDeIdade() {
		Pessoa jessica = new Pessoa("jessica", LocalDate.of(2004, 1, 1));
		Assertions.assertTrue(jessica.ehMaiorDeIdade());
	}
}
