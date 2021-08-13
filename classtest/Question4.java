package com.techment.classtest;


class Animal
{
   public void commonCharacter()
   {
	   System.out.println("Animals have 4 legs");
	   System.out.println("Animals may or may not be a pet animal\n");
   }
}

class Dog extends Animal
{

	@Override
	public void commonCharacter() {
		// TODO Auto-generated method stub
		super.commonCharacter();
		System.out.println("Dog can BARK shoutly\n");
	}
	
	
}

class Cat extends Animal
{

	@Override
	public void commonCharacter() {
		// TODO Auto-generated method stub
		super.commonCharacter();
		System.out.println("cat shout MEOW");
		System.out.println("cat is a pet animal");
		System.out.println("cat is not dangenous \n");
	}


	
    	
}

class Horse extends Animal
{

	@Override
	public void commonCharacter() {
		// TODO Auto-generated method stub
		super.commonCharacter();
		System.out.println("Horse shouts NEIGH");
		System.out.println("Horse runs very fast");
		System.out.println("Horse comes in many color \n");
	}
     
}

public class Question4 {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Horse();
		animal1.commonCharacter();
		animal2.commonCharacter();
		animal3.commonCharacter();
		

	}

}
