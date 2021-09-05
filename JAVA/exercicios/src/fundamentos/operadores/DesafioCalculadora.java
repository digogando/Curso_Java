package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
			//Ler numero 1
			System.out.print("Digite o 1º número: ");
			double num1 = entrada.nextDouble();
			
			//Ler numero 2
			System.out.print("Digite o 2º número: ");
			double num2 = entrada.nextDouble();
			
			//Ler o operador
			System.out.print("Digite o operador: ");
			String ope = entrada.next();
			
			//Realizando as operações
			double resultado = "+".equals(ope) ? num1 + num2 : 0;
				   resultado = "-".equals(ope) ? num1 - num2 : resultado;
				   resultado = "*".equals(ope) ? num1 * num2 : resultado;
				   resultado = "/".equals(ope) ? num1 / num2 : resultado;
			
			//Imprimindo o resultado
			System.out.printf("O resultado da expressão é " + resultado);
		
		entrada.close(); //fechando o scanner
	}

}
