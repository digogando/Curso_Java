package fundamentos;

public class ConversaoPrimitvoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //conversão implicita
		System.out.println(a);
		
		float b = (float) 1.0; //Informando ao JAVA para converter em um float. Isso é uma conversão explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; //explicita (CAST)
		System.out.println(f);
	}

}
