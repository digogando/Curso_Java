package fundamentos.operadores;

import java.util.Scanner;

public class ConverteFarToCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
			//Informe a temperatura
			double tempC;
			
			//Ajustes da convers�o (Temp - 32)*(5/9)
			final double ajuste = 32;
			final double multiplicador = 5.0/9.0;
			
			//Pegando a temperatura a ser convertida
			System.out.print("Digite a temperatura em �F: ");
			double tempF = entrada.nextDouble();
			
			//Realizando a convers�o
			tempC = (tempF - ajuste) * multiplicador;
			System.out.println("A temperatura em C� �: " + tempC);
		
		entrada.close(); //fechando o scanner

	}

}
