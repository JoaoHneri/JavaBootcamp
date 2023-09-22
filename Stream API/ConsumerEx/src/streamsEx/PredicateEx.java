package streamsEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
	public static void main(String[] args) {

	    List<String> palavras = Arrays.asList("Java", "kotlin", "python", "javascript", "c", "go", "ruby");
	    
	    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
	    
	    palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

	  }
}
