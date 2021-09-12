package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<String>();
		listaAprovados.add("Pituxa");
		listaAprovados.add("Luana");
		listaAprovados.add("Sandy");
		listaAprovados.add("Bianca");
		listaAprovados.add("Sirius");
		
		for(String candidato: listaAprovados){
			System.out.println(candidato);
			
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(6);
		
		for(int n: nums){
			System.out.println(n);
		}
		}
	}
}
