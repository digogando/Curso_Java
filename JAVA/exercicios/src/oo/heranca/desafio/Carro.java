package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAX;
	int velocidadeAtual;
	int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAX = velocidadeMaxima;
	}
	
	public void pisaAcelerador(){
		if(velocidadeAtual + delta > VELOCIDADE_MAX){
			velocidadeAtual = VELOCIDADE_MAX;
		} else {
			velocidadeAtual += delta;
		}
    }
	
	public void pisaFreio(){
		if(velocidadeAtual >= 5){
			velocidadeAtual -= 5;
		} else{
			velocidadeAtual = 0;
		}
	}
	
	public String toString(){
		return "Velocidade atual � " + velocidadeAtual;
	}
}
