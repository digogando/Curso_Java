package fundamentos.operadores;

import java.util.Scanner;

public class ConverteCelToFar {

	public static void main(String[] args) {
				
				Scanner entrada = new Scanner(System.in); //abrindo o scanner
				
					//Informe a temperatura
					double tempF;
					
					//Ajustes da conversão (Temp - 32)*(5/9)
					final double ajuste = 32;
					final double multiplicador = 1.8;
					
					//Pegando a temperatura a ser convertida
					System.out.print("Digite a temperatura em ºC: ");
					double tempC = entrada.nextDouble();
					
					//Realizando a conversão
					tempF = (tempC * multiplicador) + ajuste;
					System.out.println("A temperatura em Fº é: " + tempF);
				
				entrada.close(); //fechando o scanner

	}

}
