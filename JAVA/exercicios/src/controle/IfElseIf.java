package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite a nota: ");
			double nota = entrada.nextDouble();
			
			if(nota > 10 || nota < 0){
				System.out.println("Nota inválida!");
			} else if(nota >= 8.1){
					System.out.println("Tirou A");
			} else if(nota >= 6.1 && nota <= 8.0){
					System.out.println("Tirou B");
			} else if(nota >= 4.1 && nota <= 6.0){
					System.out.println("Tirou C");
			} else if(nota >= 2.1 && nota <= 4.0){
					System.out.println("Tirou D");
			} else {
				System.out.println("Tirou E");
			}
		
		entrada.close();
	}

}
