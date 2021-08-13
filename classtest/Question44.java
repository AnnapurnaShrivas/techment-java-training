package com.techment.classtest;

abstract class Animal2
{
	abstract void Shout();
}
class Horse2 extends Animal
{

	void Shout() {
		// TODO Auto-generated method stub
		System.out.println("Horse Shout Aeeee");
	}
	
}
class Cat2 extends Animal
{

	void Shout() {
		// TODO Auto-generated method stub
		System.out.println("Cat Shout Meow");
		
	}
	
}
class Dog2 extends Animal
{

	void Shout() {
		System.out.println("Dog Shout Bark");
		
	}
	
}
public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat2 cat = new Cat2();
		cat.Shout();
		Dog2 dog = new Dog2();
		dog.Shout();
		Horse2 horse = new Horse2();
		horse.Shout();
	}

}
