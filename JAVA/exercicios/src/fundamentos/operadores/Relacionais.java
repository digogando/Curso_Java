package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		double nota = 9.1;
		boolean bomAluno = false;
		boolean mediaNota = nota >= 7;
		boolean temDesconto = bomAluno && mediaNota;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
