package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
		System.out.print("Digite o seu ultimo salário: ");
		String sal1 = entrada.nextLine().replace(",",".");
		
		double num1 = Double.parseDouble(sal1); //converte a string sal1 para o numero num1
		
		System.out.print("Digite o seu penultimo salário: ");
		String sal2 = entrada.nextLine().replace(",",".");
		
		double num2 = Double.parseDouble(sal2); //converte a string sal2 para o numero num2
		
		System.out.print("Digite o seu antipenultimo salário: ");
		String sal3 = entrada.nextLine().replace(",",".");
		
		double num3 = Double.parseDouble(sal3); //converte a string sal3 para o numero num3
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.printf("A média salarial do funcionário é de: %s", media);
		
		
		entrada.close(); //fechando o scanner

	}

}
