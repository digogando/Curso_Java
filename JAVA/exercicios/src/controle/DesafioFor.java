package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++){
			System.out.println(valor);
			valor += "#";
		}
		
		/*Desafio*/
		/*Implementar o c�digo acima por�m sem utilizar numeros para controlar o for*/
		
		/*Solu��o Utilizando String e equals*/
		for(String v = "#"; !v.equals("######"); v += "#"){
			System.out.println(v);
		}
	}
}
