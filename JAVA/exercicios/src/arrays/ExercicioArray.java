package arrays;

import java.util.Arrays;


public class ExercicioArray {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 9;
		notasAlunoA[2] = 9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < 3; i++){
			total += notasAlunoA[i];
		}
		System.out.println(total/3); //Dividindo por um numero especifico pode ocorrer do numero alterar
		System.out.println(total/notasAlunoA.length); //Dividindo pelo tamanho do array, ele vai pegar sempre o tamanho atualizado
		
		double[] notasAlunoB = {6, 8.9, 6, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
	
	
}
