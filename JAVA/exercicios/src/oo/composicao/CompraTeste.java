package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Godofredo Dimitrio";
		//c1.itens.add(new Itens("Caneta", 20, 7,45));
		//c1.itens.add(new Itens("Caderno", 20, 19,90));
		//c1.itens.add(new Itens("Tesoura", 10, 9,90));
		c1.adicionarItem(new Item("Caneta", 20, 7,45));
		c1.adicionarItem(new Item("Caderno", 10, 14,90));
		c1.adicionarItem(new Item("Tesoura", 10, 9,90));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
}
