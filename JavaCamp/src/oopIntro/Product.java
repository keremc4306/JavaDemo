package oopIntro;

public class Product {
	
	//constructor
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	String name;
	double unitPrice;
	String detail;
	int id;
}