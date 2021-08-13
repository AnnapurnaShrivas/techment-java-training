package com.techment.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product
{
	int id,price,quantity;
	String name;

	
	public Product(int id, int price, int quantity, String name) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", quantity=" + quantity +" Name = "+ name + "]";
	}
}

class ProductSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		
			 if(o1.price>o2.price)
			return 1;
			 if(o1.price<o2.price)
					return -1;
			 
			else
				return 0;
		
	}
     
}



class ProductcDesendingSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price)
			return 0;
			else if(o1.price>o2.price)
			return -1;
			else
				return 1;
		
	}
     
}


class ProductcAsendingSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price)
			return 0;
			else if(o1.price>o2.price)
			return 1;
			else
				return -1;
		
	}
     
}
	




public class ComparetorDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1,43456 , 3,"cocholate"));
		prodList.add(new Product(2,6534 , 7,"dairymilk"));
		prodList.add(new Product(3,65 , 20,"kitkat"));
		prodList.add(new Product(4,334 , 10,"melodi"));
		prodList.add(new Product(5,955 , 8,"munch"));
		
		
		System.out.println("==============Normal List====================");
		for(Product s :prodList)
		{
			System.out.println(s);
		}
		
		
		
		System.out.println("\n\n==============Price List greater then 500====================");
		
		for(Product s :prodList)
		{
			if(s.price>500)
			System.out.println(s);
		}
		
		
		System.out.println("\n\n==============Price List Sorted in desending order====================");
		Collections.sort(prodList, new ProductcDesendingSorting()); 
		// we can use reverseOrder() also for desending order
		//by writing   Collections.sort(prodList, Collections.reverseOrder());
		for(Product s :prodList)
		{
			System.out.println(s);
		}
		
		
		
		System.out.println("\n\n==============Price List Sorted in accending order====================");
		Collections.sort(prodList, new ProductcAsendingSorting());
		for(Product s :prodList)
		{
			System.out.println(s);
		}
		
		
		
	}

}
