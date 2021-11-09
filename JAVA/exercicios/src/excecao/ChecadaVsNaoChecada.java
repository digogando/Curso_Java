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
	
	//Não checada ou não verifica
	static void geraErro1(){
		throw new RuntimeException("Ocorreu um erro doido #01!");
	}
	
	//Exceção checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro muito doido #02!");
	}

}
