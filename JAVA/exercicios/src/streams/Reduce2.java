package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Function;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Rony", 5.5);
		Aluno a2 = new Aluno("Gina", 8.0);
		Aluno a3 = new Aluno("Hermione", 10.0);
		Aluno a4 = new Aluno("Harry", 9.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatório = (a, b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatório)
			.ifPresent(System.out::println);

	}

}
