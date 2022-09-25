package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Nice Laptop", 5000, 100, "Siyah");

		// 2.yol
//		Product product = new Product();
//		product.setId(1);
//		product.setName("Laptop");
//		product.setPrice(5000);
//		product.setDescription("Nice laptop");
//		product.setStockAmount(100);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
