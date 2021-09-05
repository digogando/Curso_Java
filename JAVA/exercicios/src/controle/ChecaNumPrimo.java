package controle;

import java.util.Scanner;

public class ChecaNumPrimo {

	private static Scanner entrada;

	public static boolean main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite o número: ");
		num = entrada.nextInt();
		
		for (int j = 2; j < num; j++) {
	        if (num % j == 0)
	            return false;   
	    }
	    return true;
	}
}
