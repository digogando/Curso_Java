package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		CaixaInt<Integer> caixaA = new CaixaInt<Integer>();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);

	}

}
