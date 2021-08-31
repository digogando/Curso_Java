package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //O L � para informar que este n�mero � ul literal inteiro.
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; //Indica que � um literal float.
		double vendasAcumuladas = 2_991_797_103.01;
	
		//Tipo booleano
		boolean estaFerias = false;
		
		// Tipo caractere
		char status = 'A'; //Ativo
	
		// Dias de empresa
		System.out.println(anosEmpresa * 365);
		
		// Numero de Viagens
		System.out.println(numeroVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaFerias);
		System.out.println("Status: " + status);
		//
	}

}
