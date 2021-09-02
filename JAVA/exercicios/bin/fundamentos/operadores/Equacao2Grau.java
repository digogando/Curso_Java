package fundamentos.operadores;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
		/*Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		 * utilizando a fórmula de Bhaskara.Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta */
		
		//(ax2 + bx + c = 0)
		
		//Entrada de dados
		System.out.print("Digite o 1º número da expressão: ");
		int a = entrada.nextInt();
		
		System.out.print("Digite o 2º número da expressão: ");
		int b = entrada.nextInt();
		
		System.out.print("Digite o 3º número da expressão: ");
		int c = entrada.nextInt();
		
		//Calculando o DELTA
		int delta = (b * b) - (4 * a * c);
		
		System.out.println("O DELTA da expressão é: " + delta);
		
		//Calculando o X1
		double x1 = (-b + Math.sqrt(delta))/2*a;
		
		//Calculando o X2
		double x2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.printf("O X1 da expressão é: %.1f \n", x1);
		System.out.printf("O X2 da expressão é: %.1f", x2);
		
		entrada.close(); //fechando o scanner
	}

}
