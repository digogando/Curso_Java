package fundamentos.operadores;

import java.util.Scanner;

public class CalcTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //abrindo o scanner
		
		//Pegando a base do triangulo
		System.out.print("Digite a base do triangulo: ");
		double baseTri = entrada.nextDouble();
		
		//Pegando a altura do triangulo
		System.out.print("Digite a altura do triangulo: ");
		double alturaTri = entrada.nextDouble();
		
		double area = (baseTri * alturaTri)/2;
		
		//double resultadoDobro = Math.pow(numero, 2);
		
		System.out.printf("A área do triângulo é de: %s", area);
	
	entrada.close();

	}

}
