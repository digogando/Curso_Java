package controle;

import java.util.Scanner;


public class DesafioWhile {

	public static void main(String[] args) {
		/*Desafio para calcular a média de notas de alunos.*/
		
		/*Armazenar as notas válidas ( 0 a 10) e imprimir a médias das notas
		 * quando o usuário digitar -1 indicando que deseja finalizar o programa.*/
		
		Scanner entrada = new Scanner(System.in);
		int qntdNotas = 0;
		double nota = 0, total = 0;
		
		while(nota != -1){
			
			System.out.print("Digite uma nota válida ou -1 para sair.");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >=0){
				total += nota;
				qntdNotas++;
			} else {
				System.out.println("Nota inválida seu lerdo!");
			}
						
		}
		
		double media = total/qntdNotas;
		System.out.println("A média das notas é: " + media);
		
		entrada.close();
	}
}
