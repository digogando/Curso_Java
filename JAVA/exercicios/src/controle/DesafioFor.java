package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++){
			System.out.println(valor);
			valor += "#";
		}
		
		/*Desafio*/
		/*Implementar o código acima porém sem utilizar numeros para controlar o for*/
		
		/*Solução Utilizando String e equals*/
		for(String v = "#"; !v.equals("######"); v += "#"){
			System.out.println(v);
		}
	}
}
