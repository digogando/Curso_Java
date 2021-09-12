package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Ofer e Add adicionam elementos na fila
		//A diferen�a � o comportamento quando a fila est� cheia
		fila.add("Sirius"); //Retorna false
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.add("Luana");
		fila.offer("Bianca");
		fila.add("Xerife");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		fila.size();
		fila.clear();
		fila.isEmpty();
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
	}
}
