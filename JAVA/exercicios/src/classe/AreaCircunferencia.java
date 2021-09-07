package classe;

public class AreaCircunferencia {

	double raio;
	double pi = 3.14;
	
	AreaCircunferencia(double raioInicial){
		raio = raioInicial;
	}
	
	double area(){
		return pi * Math.pow(raio, 2);
	}
}
