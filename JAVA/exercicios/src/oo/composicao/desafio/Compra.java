package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Compra {

	List<Item> itens = new ArrayList<>();
		
	void adicionarItem(Produto p, int qntd){
		this.itens.add(new Item(p, qntd));
	}
	
	void adicionarItem(String nome, double preco, int qntd){
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qntd));
	}
	
	double obterValorTotal(){
		double total = 0;
		
		for(Item item: itens){
			total += item.qntd * item.produto.preco;
		}
		return total;
	}
}
