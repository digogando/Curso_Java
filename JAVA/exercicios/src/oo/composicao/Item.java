package oo.composicao;

public class Item {

	String nome;
	int qntd;
	double preco;
	public Compra compra;
	
	Item(String nome, int qntd, double preco, int i){
		
		this.nome = nome;
		this.qntd = qntd;
		this.preco = preco;
	}

	public Item(String nome2, int qntd2, double preco2) {
		// TODO Auto-generated constructor stub
	}
}
