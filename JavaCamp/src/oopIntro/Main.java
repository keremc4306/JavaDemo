package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(); //referans olu�turma, instance
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		
		
		
		Product[] products = {product1};
		
		System.out.println(products.length);
	}
}