package controle;

import java.util.Scanner;


public class DesafioWhile {

	public static void main(String[] args) {
		/*Desafio para calcular a m�dia de notas de alunos.*/
		
		/*Armazenar as notas v�lidas ( 0 a 10) e imprimir a m�dias das notas
		 * quando o usu�rio digitar -1 indicando que deseja finalizar o programa.*/
		
		Scanner entrada = new Scanner(System.in);
		int qntdNotas = 0;
		double nota = 0, total = 0;
		
		while(nota != -1){
			
			System.out.print("Digite uma nota v�lida ou -1 para sair.");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >=0){
				total += nota;
				qntdNotas++;
			} else {
				System.out.println("Nota inv�lida seu lerdo!");
			}
						
		}
		
		double media = total/qntdNotas;
		System.out.println("A m�dia das notas �: " + media);
		
		entrada.close();
	}
}
