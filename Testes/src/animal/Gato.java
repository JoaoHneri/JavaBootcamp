package animal;

public class Gato {
	
/**
 * @param args
 */
public static void main(String[] args) {
	animal gato = new animal();


	gato.cagar();
	
	
	System.out.println(1 > 2 ? "verdade" : "falso");
	
	int nois = 1;
	
	switch (nois) {
	case 1: {
		System.out.println("abaixo");
		break;
	}case 2:{
		System.out.println("no padrão");
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + nois);
	}
	
	
	for(int i = 0; i < 10; i++) {
		System.out.println(i);
	}
	
	String nom = "João";
	
	System.out.println(nom.equals("João"));

	System.out.println(gato.somar());
}	


	
	
	
	

}
