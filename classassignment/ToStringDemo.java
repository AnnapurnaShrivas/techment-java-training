package com.techment.classassignment;



class Product
{
	int id,price;
	String name;
	
	public Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override                                                        //without this override block ... we get only the address but with this ... we get the perfect output
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}

public class ToStringDemo {

	public static void main(String[] args) {
	
		Product product1 = new Product(100, "Mobile", 25000);
		Product product2 = new Product(1002, "Laptop", 60000);
		
		System.out.println(product1);
		System.out.println(product1.toString());
	}

}
