package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arros", 0.223);
		Comida c2 = new Comida("Feij�o", 0.300);
		
		Pessoa p = new Pessoa("Jo�o", 88);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}
}
