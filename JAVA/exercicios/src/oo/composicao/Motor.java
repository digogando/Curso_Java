package oo.composicao;

public class Motor {

	double fatorInjecao = 1;
	boolean ligado;
	
	int giros(){
		if(!ligado){
			return 0;
		}
		return (int) (fatorInjecao * 300);
		
	}
}
