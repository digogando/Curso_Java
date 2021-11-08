package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Godofredo", 8.5);
		Aluno a2 = new Aluno("Gioconda", 5.4);
		Aluno a3 = new Aluno("Gertrudes", 9.5);
		Aluno a4 = new Aluno("Gean", 5.5);
		Aluno a5 = new Aluno("Gilberto", 7.5);
		Aluno a6 = new Aluno("Gabriela", 2.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!")
			.forEach(System.out::println);
		
		/*
		 * Predicate<ALuno> aprovado = a -> a.nota >= 7;
		 * Function<Aluno, String> saudacaoAprovado =
		 * 			a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		 *
		 * alunos.stream()
		 * .filter(a -> a.nota >= 7)
		 * .map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!")
		 *.forEach(System.out::println); 
		 * */
	}
}
