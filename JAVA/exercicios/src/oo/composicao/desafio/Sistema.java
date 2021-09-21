package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jubertina Souza de Jesus");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Vibrador",199.99,1);
		compra1.adicionarItem(new Produto("Jockstrap", 49.90, 3), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Calcinha",29.99,1);
		compra1.adicionarItem(new Produto("Dados do Amor", 9.90, 1), 2);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
