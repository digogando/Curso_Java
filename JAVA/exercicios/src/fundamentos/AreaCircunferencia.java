package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio = 3.4;
		final double pi = 3.14; //final pq o valor de PI não varia, será sempre esse valor.
		
		double area = pi * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Área " + area + "m².");
	}

}
