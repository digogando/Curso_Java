package controle;

/*Criar um programa que informa se o ano atual é um ano bissexto*/

import java.util.GregorianCalendar;
import java.util.Scanner;

public class DesafioAnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anoAtual;
		
		System.out.print("Digite o ano: ");
		anoAtual = entrada.nextInt();
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(anoAtual));
		
		if (true) {
			System.out.println("O ano é bissexto!");
		}
			
		entrada.close();
	}
}
