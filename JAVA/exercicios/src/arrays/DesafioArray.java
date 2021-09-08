package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Calcular a m�dia de notas de um aluno
 * O usu�rio ir� informar o n�mero de notas.
 * Utilizar 2 la�os de for:
 * O 1� for ser� tradicional e ir� armazenar as notas no array.
 * O 2� for ser� um for each e ir� percorrer o array somando as notas e mostrando a m�dia*/



public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
			//int numNotas = 0;
			//double totalNotas = 0;
			
			System.out.print("Digite a quantidade de notas: ");
			int numNotas = (int) entrada.nextInt();
		
			double[] notasAluno = new double[numNotas];
			
			for(int i = 0; i < notasAluno.length; i++){
				System.out.println("Informe a" + " " + (i + 1) +"�" + " " + "nota do aluno: " );
				notasAluno[i] = entrada.nextDouble();
			}
			
			System.out.println(Arrays.toString(notasAluno));
			
			double total = 0;
			for (double notas: notasAluno) {
				total += notas;
			}
			
			double media = total/notasAluno.length;
					System.out.println("A m�dia das notas � " + media);
			
			entrada.close();
		}

}
