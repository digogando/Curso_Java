package fundamentos.operadores;

public class DesafioAritmeticoCorrecao {

	public static void main(String[] args) {
		
		double num1 = Math.pow(6 * (3 + 2), 2);
		double den1 = 3 * 2;
		
		double num2 = (1-5) * (2-7);
		double den2 = 2;
		
		double sup1 = num1/den1;
		double sup2 = Math.pow(num2/den2, 2);
		
		double sup = Math.pow(sup1 - sup2, 3);
		double inf = Math.pow(10, 3);
		
		double resultado = sup/inf;
		
		System.out.println("O resultado da expressão é " + resultado);
	}

}
