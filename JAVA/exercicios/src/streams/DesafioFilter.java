package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Drag a1 = new Drag("Bebe Zahara", 8.5);
		Drag a2 = new Drag("Tyra", 1.5);
		Drag a3 = new Drag("Raja", 6.5);
		Drag a4 = new Drag("Sharon Needles", 9.0);
		Drag a5 = new Drag("Jyinx Monsoon", 9.5);
		Drag a6 = new Drag("Bianca Del Rio", 10.0);
		Drag a7 = new Drag("Violet", 6.5);
		Drag a8 = new Drag("Bob The Drag Queen", 8.0);
		Drag a9 = new Drag("Careca", 5.5);
		Drag a10 = new Drag("Aquaria", 9.5);
		Drag a11 = new Drag("Yvie Oddly", 9.5);
		Drag a12 = new Drag("Jaida Essence Hall", 8.5);
		Drag a13 = new Drag("Symone", 8.5);
		
		
		List<Drag> drag = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13);
		
		drag.stream()
			.filter(a -> a.nota >= 10)
			.map(a -> "Condragulations " + a.drag + "!! You are a winner baby!!")
			.forEach(System.out::println);
		
		drag.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Start your engines " + a.drag + ", and may the best DRAG QUEEN win the SUPER ALL STAR!!")
			.forEach(System.out::println);

	}

}
