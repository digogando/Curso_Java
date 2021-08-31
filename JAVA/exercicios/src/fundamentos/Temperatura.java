package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tempF = 86;
		double tempC = 0;
		final double ajuste = 32;
		final double multiplicador = 5.0/9.0;
		
		tempC = (tempF - ajuste) * multiplicador;
		System.out.println("A temperatura em Cº é: " + tempC);
		
	}

}
