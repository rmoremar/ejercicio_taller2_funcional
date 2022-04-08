package ejercicio_taller2_prog_funcional;

import java.math.BigDecimal;
import java.util.List;

public class ApplicationMain {
	public static void main(String[] args) {

		List<Product> shoppingCart = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		// Implementación
		
		//Mostrar total
		BigDecimal total = new BigDecimal("0.0");
		for (Product product : shoppingCart) {
			total = total.add(product.applyTax());
		}

		System.out.println("Precio total con IVA: " + total);

		//Mostrar productos que empiezan por C
		System.out.println("Productos que empizan por la letra 'C'");
		shoppingCart.forEach(prod -> {
			if (prod.getName().charAt(0) == 'C') {
				System.out.println(prod.toString());
			}
		});
	}
}
