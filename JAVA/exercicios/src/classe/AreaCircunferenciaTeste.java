package classe;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {
		
		AreaCircunferencia a1 = new AreaCircunferencia(5.6);
		//a1.pi = 5.6;
		System.out.println(a1.area());
		
		AreaCircunferencia a2 = new AreaCircunferencia(5);
		//a2.pi = 0;
		
		//AreaCircunferencia.pi = 3.1415;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
	}
}
