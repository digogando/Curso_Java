package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8;
		String recuperacao = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : recuperacao;
		
		System.out.println("O Aluno foi " + resultado);
	}

}
