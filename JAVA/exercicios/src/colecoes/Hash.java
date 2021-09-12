package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Gioconda"));
		usuarios.add(new Usuario("Florinda"));
		usuarios.add(new Usuario("Thamires"));
		
		boolean resultado = usuarios.contains(new Usuario("Thamires"));
		System.out.println(resultado);
	}
}
