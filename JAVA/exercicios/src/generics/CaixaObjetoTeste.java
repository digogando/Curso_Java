package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjetos caixaA = new CaixaObjetos();
		caixaA.guardar(2);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjetos caixaB = new CaixaObjetos();
		caixaB.guardar("Oie");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);

	}

}
