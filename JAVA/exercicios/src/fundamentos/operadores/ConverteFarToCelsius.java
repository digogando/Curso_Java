package fundamentos.operadores;

import java.util.Scanner;

public class ConverteFarToCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
			//Informe a temperatura
			double tempC;
			
			//Ajustes da conversão (Temp - 32)*(5/9)
			final double ajuste = 32;
			final double multiplicador = 5.0/9.0;
			
			//Pegando a temperatura a ser convertida
			System.out.print("Digite a temperatura em ºF: ");
			double tempF = entrada.nextDouble();
			
			//Realizando a conversão
			tempC = (tempF - ajuste) * multiplicador;
			System.out.println("A temperatura em Cº é: " + tempC);
		
		entrada.close(); //fechando o scanner

	}

}
