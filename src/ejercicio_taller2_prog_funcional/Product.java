package ejercicio_taller2_prog_funcional;

import java.math.BigDecimal;

public class Product {

	private String name;
	private BigDecimal price;
	private Tax tax;

	public Product(String name, BigDecimal price, Tax tax) {
		super();
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public BigDecimal applyTax() {
		switch (tax) {
		case REDUCED:
			return price.multiply(new BigDecimal("1.10"));
		case SUPERREDUCED:
			return price.multiply(new BigDecimal("1.04"));
		case NORMAL:
			return price.multiply(BigDecimal.valueOf(1.21));
		default:
			return null;
		}
	}
}
