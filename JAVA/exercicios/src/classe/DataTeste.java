package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 06;
		d1.mes = 9;
		d1.ano = 2021;
		
		System.out.printf("A data de hoje é: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
	
		Data d2 = new Data();
		d2.dia = 26;
		d2.mes = 5;
		d2.ano = 1955;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
	}
}
