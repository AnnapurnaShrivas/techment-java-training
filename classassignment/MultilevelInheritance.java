package com.techment.classassignment;

  class Animal
{  
  void eat(){System.out.println("PARENT CLASS eating...");}  
}  
  
   class Dog extends Animal
 {  
   void bark(){System.out.println("CHILD CLASS 1 barking...");}  
} 
   
   
   class BabyDog extends Dog
{  
     void weep(){System.out.println("CHILD CLASS 2 weeping...");}  
}  


public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();

	}

}
