package fundamentos.operadores;

import java.util.Scanner;

public class ConverteCelToFar {

	public static void main(String[] args) {
				
				Scanner entrada = new Scanner(System.in); //abrindo o scanner
				
					//Informe a temperatura
					double tempF;
					
					//Ajustes da convers�o (Temp - 32)*(5/9)
					final double ajuste = 32;
					final double multiplicador = 1.8;
					
					//Pegando a temperatura a ser convertida
					System.out.print("Digite a temperatura em �C: ");
					double tempC = entrada.nextDouble();
					
					//Realizando a convers�o
					tempF = (tempC * multiplicador) + ajuste;
					System.out.println("A temperatura em F� �: " + tempF);
				
				entrada.close(); //fechando o scanner

	}

}
