package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arros", 0.223);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("João", 88);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
