package com.techment.presentation;


class ABC
		{
			public void show(int a)
			{
				System.out.println("Integer value is:"+a);
			}
			public void show(String s)
			{
				System.out.println("String value is :::"+s);
			}
		}


public class PresentOverloading {

	
			public static void main(String az[])
			{
				ABC ob=new ABC();
				ob.show(120);
				ob.show("Ashish");
			}
		

	}


