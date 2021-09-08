package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Calcular a média de notas de um aluno
 * O usuário irá informar o número de notas.
 * Utilizar 2 laços de for:
 * O 1º for será tradicional e irá armazenar as notas no array.
 * O 2º for será um for each e irá percorrer o array somando as notas e mostrando a média*/



public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
			//int numNotas = 0;
			//double totalNotas = 0;
			
			System.out.print("Digite a quantidade de notas: ");
			int numNotas = (int) entrada.nextInt();
		
			double[] notasAluno = new double[numNotas];
			
			for(int i = 0; i < notasAluno.length; i++){
				System.out.println("Informe a" + " " + (i + 1) +"º" + " " + "nota do aluno: " );
				notasAluno[i] = entrada.nextDouble();
			}
			
			System.out.println(Arrays.toString(notasAluno));
			
			double total = 0;
			for (double notas: notasAluno) {
				total += notas;
			}
			
			double media = total/notasAluno.length;
					System.out.println("A média das notas é " + media);
			
			entrada.close();
		}

}
