package oo.heranca;

public class Jogador {

	int x;
	int y;
	
	/*boolean andar(String direcao){
		if("norte".equalsIgnoreCase(direcao)){
			y++;
		}
		return true;
	}*/
	
	boolean andar(Direcao direcao){
		switch(direcao){
		case NORTE:
			y--;
		case LESTE:
			x++;
		case SUL:
			y++;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
