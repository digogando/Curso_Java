package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		
		/*N�o vai funcionar sem iniciar a vari�vel s2.
		 * String s2;
		System.out.println(s2.concat("?????"));*/
		
		/*Vai dar erro Nupointer Exception devido a vari�vel estar nula
		 * String s2 = null;
		System.out.println(s2.concat("?????"));*/
		
		/*Vai dar erro pq a vari�vel vai ser sempre nula.
		if(s2 != null){
			System.out.println(s2.concat("?????"));
		}*/
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
	if(s2 != null){
		System.out.println(s2.concat("?????"));
	}
	}
}
