package fundamentos.operadores;

import java.util.Scanner;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		int var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15;
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
			System.out.print("Digite o primeiro n�mero: ");
			String num1 = entrada.nextLine();
			int numero1 = Integer.parseInt(num1); //converte a string num1 para o numero numero1
			
			System.out.print("Digite o segundo n�mero: ");
			String num2 = entrada.nextLine();
			int numero2 = Integer.parseInt(num2); //converte a string num2 para o numero numero2
			
			System.out.print("Digite o terceiro n�mero: ");
			String num3 = entrada.nextLine();
			int numero3 = Integer.parseInt(num3); //converte a string num3 para o numero numero3
			
			System.out.print("Digite o quarto n�mero: ");
			String num4 = entrada.nextLine();
			int numero4 = Integer.parseInt(num4); //converte a string num4 para o numero numero4
			
			System.out.print("Digite o quinto n�mero: ");
			String num5 = entrada.nextLine();
			int numero5 = Integer.parseInt(num5); //converte a string num5 para o numero numero5
			
			var1 = numero1; //Recebe o primeiro numero
			var2 = numero2 + numero3; //Faz a express�o no parenteses
			var3 = var1 * var2; // Multiplica o numero pelo resultado do bal�o
			var4 = numero4 * numero5; //Multiplica os numeros debaixo da express�o
			var5 = (int) Math.pow(var3, 2);// Eleva a segunda potencia
			var6 = var5/var4; // Divide os valores de cima pelo debaixo
			
			
			System.out.print("Digite o sexto n�mero: ");
			String num6 = entrada.nextLine();
			int numero6 = Integer.parseInt(num6); //converte a string num6 para o numero numero6
			
			System.out.print("Digite o s�timo n�mero: ");
			String num7 = entrada.nextLine();
			int numero7 = Integer.parseInt(num7); //converte a string num7 para o numero numero7
			
			System.out.print("Digite o oitavo n�mero: ");
			String num8 = entrada.nextLine();
			int numero8 = Integer.parseInt(num8); //converte a string num8 para o numero numero8
			
			System.out.print("Digite o nono n�mero: ");
			String num9 = entrada.nextLine();
			int numero9 = Integer.parseInt(num9); //converte a string num9 para o numero numero9
			
			System.out.print("Digite o d�cimo n�mero: ");
			String num10 = entrada.nextLine();
			int numero10 = Integer.parseInt(num10); //converte a string num10 para o numero numero10
			
			var7 = numero6 - numero7; //Faz a express�o do 1� parenteses
			var8 = numero8 - numero9; //Faz a express�o do 2� parenteses
			var9 = var7 * var8; //Faz a multiplica��o fora dos parenteses
			var10 = var9/numero10; //Faz a divis�o do resultado por 2
			var11= (int) Math.pow(var10, 2); //eleva a segunda potencia
			
			var12 = var6 - var11; 
			
			var13 = (int) Math.pow(var12, 3);// eleva a 3� potencia
			
			System.out.print("Digite o 11� n�mero: ");
			String num11 = entrada.nextLine();
			int numero11 = Integer.parseInt(num11); //converte a string num11 para o numero numero11
			
			var14 = (int) Math.pow(numero11, 3); //eleva a 3� potencia
			
			var15 = var13/var14;
			
			System.out.printf("O resultado da express�o �: %d", var15);
	
		entrada.close(); //fechando o scanner

	}

}
