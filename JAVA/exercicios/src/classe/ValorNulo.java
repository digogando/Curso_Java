package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		
		/*Não vai funcionar sem iniciar a variável s2.
		 * String s2;
		System.out.println(s2.concat("?????"));*/
		
		/*Vai dar erro Nupointer Exception devido a variável estar nula
		 * String s2 = null;
		System.out.println(s2.concat("?????"));*/
		
		/*Vai dar erro pq a variável vai ser sempre nula.
		if(s2 != null){
			System.out.println(s2.concat("?????"));
		}*/
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
	if(s2 != null){
		System.out.println(s2.concat("?????"));
	}
	}
}
