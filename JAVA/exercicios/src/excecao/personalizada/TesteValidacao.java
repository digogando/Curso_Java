package excecao.personalizada;

import excecao.Aluno;

public class TesteValidacao {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Geraldiny", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e){
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");

	}

}
