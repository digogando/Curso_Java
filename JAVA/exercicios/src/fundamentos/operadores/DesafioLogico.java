package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		
		//V e V --> TV de 50�
		//V e F --> TV 32�
		//Ambos al�m da TV sorvete no shopping
		//F e F familia em casa e sem tv
		
		boolean jobT = true;
		boolean jobQ = false;
		
		boolean tv50 = jobT && jobQ;
		System.out.println("Comprou TV 50�? " + tv50);
		
		boolean tv32 = jobT ^ jobQ;
		System.out.println("Comprou TV 32�?" + tv32);
		
		boolean sorvete = jobT || jobQ;
		System.out.println("Comprou sorvete?" + sorvete);
		
		boolean semSorvete = !sorvete;
		System.out.println("N�o comprou sorvete!" + semSorvete);
	}

}
