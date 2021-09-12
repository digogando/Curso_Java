package colecoes;

import java.util.ArrayList;


public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Bertolina");
		lista.add(u1);
		
		lista.add(new Usuario("Astolfo"));
		lista.add(new Usuario("Brida"));
		lista.add(new Usuario("Deosdete"));
		lista.add(new Usuario("Farley"));
		
		System.out.println(lista.get(3)); //Acessando pelo indice
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Manu")));
		
		for(Usuario u: lista){
			System.out.println(u.nome);
			
		
		}
	}
}
