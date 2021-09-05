package controle;

import java.util.Scanner;

/*Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par*/

public class DesafioChecaNums {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			double num = 0;
			
			System.out.print("Digite o número: ");
			num = entrada.nextDouble();
			
			if (num < 0 && num > 10){
				System.out.println("O número não está no intervalo entre 0 e 10.");
			} else {
				System.out.println("O número está no intervalo de 0 a 10.");
			}
			
			if(num % 2 == 0){
				System.out.println("Numero par!");
			}
			else System.out.println("Numero impar!");
			
		entrada.close();
	}
}
