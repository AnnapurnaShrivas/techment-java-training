package com.techment.classassignment;

public class VeriableDemo {
		int a=10;    //globle variable
		int size=100;
	void display1()
	{
		int height=90;    //local
		int size= 678;         //local
		System.out.println(" a = "+a+" height = "+height+ "size = "+size+ " globle size = "+ this.size);
	}
	

	void display2()
	{
		int width=78;    //local
		int size= 78989899;         //local
		System.out.println(" a = "+a+" width = "+width+ "size = "+size+ " globle size = "+this.size);
	}


	public static void main(String[] args) {

	VeriableDemo veriableDemo =new VeriableDemo();
	veriableDemo.display1();
	veriableDemo.display2();
		
			}

}
