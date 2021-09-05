package fundamentos.operadores;

import java.util.Scanner;

public class CalculaQuadCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
			//Pegando o número
			System.out.print("Digite o número: ");
			double numero = entrada.nextDouble();
			
			double resultadoDobro = Math.pow(numero, 2);
			
			System.out.printf("O valor de %s ao quadrado é: %s\n", numero, resultadoDobro);
			
			double resultadoCubo = Math.pow(numero, 3);
			
			System.out.printf("O valor de %s ao cubo é: %s", numero, resultadoCubo);
		
		entrada.close();
	}

}
