package com.techment.oppsassignment;


// Encapsulation & Inheritance........QUESTION 2 ..
import java.util.Scanner;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	}


class EngineeringBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}


public class BookDetails {

	public static void main(String[] args) {

		Book book=new Book();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Author name\n");
		String authorName = sc.next();
		System.out.println("Enter Title\n");
	    String title = sc.next();
	    System.out.println("Enter Price\n");
	    float price = (float) sc.nextDouble();
	    System.out.println("Enter book Number\n");
	    int bookno = sc.nextInt();
		book.setAuthor(authorName);
		book.setBookNo(bookno);
		book.setPrice(price);
		book.setTitle(title);
		
		EngineeringBook engineeringBook = new EngineeringBook();
		engineeringBook.setCategory("Science");
		engineeringBook.setAuthor(authorName);
		engineeringBook.setBookNo(bookno);
		engineeringBook.setPrice(price);
		engineeringBook.setTitle(title);
        System.out.println(" Book Catogory = "+engineeringBook.getCategory());
        System.out.println(" Author name = "+engineeringBook.getAuthor());
        System.out.println(" Title = "+engineeringBook.getTitle());
        System.out.println("Book no. = "+engineeringBook.getBookNo());
        System.out.println(" book Price = "+engineeringBook.getPrice());
	}

}
