package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void mains(String[] args){
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		Produto p1 = new Produto("Caneta", 9.90, 0.09);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 3000,99);
		imprimirNome.accept(p2);
		
		Produto p3 = new Produto("Caderno", 19,99);
		imprimirNome.accept(p3);
		
		Produto p4 = new Produto("Tesoura", 25.99, 0.95);
		imprimirNome.accept(p4);
		
		Produto p5 = new Produto("Régua", 1.99, 0.19);
		imprimirNome.accept(p5);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
