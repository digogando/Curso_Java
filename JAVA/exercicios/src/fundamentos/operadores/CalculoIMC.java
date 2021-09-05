package fundamentos.operadores;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
		//Informe o peso
		double imc;
		
		//Pegando o peso
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite a sua altura(em cm): ");
		double altura = entrada.nextDouble();
		
		//Realizando o calculo
		imc = (peso/ (altura = Math.pow(altura, 2))*10000);
		System.out.printf("O seu IMC é: %.2f",imc);
	
	entrada.close(); //fechando o scanner

	}

}
