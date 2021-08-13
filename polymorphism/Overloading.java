package com.techment.polymorphism;

class Hello
{
    public void write(int num)
    {
    	System.out.println("you have written a number that is == "+num);
    }
    
    public void write(String msg)
    {
    	System.out.println("you have written a String that is == "+msg);
    }
    
    public int addition(int a, int b)
    {
    	return a+b;
    	
    }
    
    public int addition(int a,int b,int c)
    
    {
    	return a+b+c;
    	
    }
}

public class Overloading {

	public static void main(String[] args) {
		

		Hello hello= new Hello();
		hello.write(1234);                      // one method can behave differently .. accoring to out input
		hello.write("Hii i m annapurna");
		System.out.println(hello.addition(5, 10));
		System.out.println(hello.addition(5, 10, 15));
	}

}
