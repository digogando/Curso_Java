package arrays;

import java.util.Date;

public class Equal {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Gioconda Onofre";
		u1.email = "gigio_sapequinha@yahoo.com.br";

		Usuario u2 = new Usuario();
		u1.nome = "Gioconda Onofre";
		u1.email = "gigio_sapequinha@yahoo.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}
}
