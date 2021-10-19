package oo.heranca.desafio;

public class Uno extends Carro {

	public Uno(){
		this(315);
	}
	
	public Uno(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 350;
	}
	
	@Override
	public void pisaAcelerador() {
		velocidadeAtual += 15;
	}
	
	
}
