package oo.heranca.desafio;

public class Carro {

	/*String Chevette;
	String Uno;
	String Voyage;
	String Gol;*/
	
	int velocAtual;
	
	void pisaAcelerador(){
		velocAtual += 5;
	}
	
	void pisaFreio(){
		if(velocAtual >= 5){
			velocAtual -= 5;
		} else{
			velocAtual = 0;
		}
	}
	
	public String toString(){
		return "Velocidade atual é " + velocAtual;
	}
}
