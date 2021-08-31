package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(0)); //Mostra qual  a letra na posição 0.
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		s = "Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Rodrigo";
		String sobrenome = "Ogando";
		int idade = 34;
		double salario = 123456.90;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade +"\nSalario: " + salario + "\n\n");
		System.out.printf("O funcionário %s %s, que tem %s anos de idade, recebe um salário de R$%s.", nome, sobrenome, idade, salario);
	}

}
