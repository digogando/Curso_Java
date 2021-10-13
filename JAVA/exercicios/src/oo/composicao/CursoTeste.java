package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Euzebil");
		Aluno aluno2 = new Aluno("Jefrey");
		Aluno aluno3 = new Aluno("Britney");
		
		Curso curso1 = new Curso("Costura");
		Curso curso2 = new Curso("Moda");
		Curso curso3 = new Curso("Marcenaria");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos){
			System.out.println("Estou fazendo o curso " + curso3.nome + "...");
			System.out.println("... e o meu nome � " + aluno.nome);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Costura");
		
		if(cursoEncontrado != null){
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
