package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Bras Cubas");
		livros.push("Lady Killers");
		livros.push("15 Minutos");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.size());
		System.out.println(livros.poll());
		
	}
}
