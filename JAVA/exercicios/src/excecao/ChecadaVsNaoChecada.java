package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e){
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Fim :)");
	}
	
	//N�o checada ou n�o verifica
	static void geraErro1(){
		throw new RuntimeException("Ocorreu um erro doido #01!");
	}
	
	//Exce��o checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro muito doido #02!");
	}

}
