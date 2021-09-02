package fundamentos.operadores;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
		/*Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0)
		 * utilizando a f�rmula de Bhaskara.Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta */
		
		//(ax2 + bx + c = 0)
		
		//Entrada de dados
		System.out.print("Digite o 1� n�mero da express�o: ");
		int a = entrada.nextInt();
		
		System.out.print("Digite o 2� n�mero da express�o: ");
		int b = entrada.nextInt();
		
		System.out.print("Digite o 3� n�mero da express�o: ");
		int c = entrada.nextInt();
		
		//Calculando o DELTA
		int delta = (b * b) - (4 * a * c);
		
		System.out.println("O DELTA da express�o �: " + delta);
		
		//Calculando o X1
		double x1 = (-b + Math.sqrt(delta))/2*a;
		
		//Calculando o X2
		double x2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.printf("O X1 da express�o �: %.1f \n", x1);
		System.out.printf("O X2 da express�o �: %.1f", x2);
		
		entrada.close(); //fechando o scanner
	}

}
