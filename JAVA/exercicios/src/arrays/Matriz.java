package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Quantidade de alunos: ");
			int qtdAlunos = entrada.nextInt();
			
			System.out.println("Quais as notas: ");
			int qtdNotas = entrada.nextInt();
			
			double[][] notasTurma = new double[qtdAlunos][qtdNotas];
			
			double total = 0;
			for (int a = 0; a < notasTurma.length; a++){
				for (int n = 0; n < notasTurma[a].length; n++){
					System.out.printf("Informe a nota %d do aluno %d: "
							, n + 1, a + 1);
					notasTurma[a][n] = entrada.nextDouble();
					total += notasTurma[a][n];
				}
			}
			
			double media = total/(qtdAlunos * qtdNotas);
			System.out.println("A média da turma é " + media);
		
		entrada.close();
	}
}
