package com.techment.ishas;


// showing Has A relationship
class Car
{
	   int model;
	   String name;
	   Engine engine;
	public Car(int model, String name, Engine engine) {
		super();
		this.model = model;
		this.name = name;
		this.engine = engine;
	}
	   
	 void displayCarInfo()
	    
	    {
	    	
	    	System.out.println("name : "+name);
	    	System.out.println("Model  : "+model);   
	    	System.out.println("Engine Id : "+engine.engineid);
	    	System.out.println("Engine Type: "+engine.enginetype);
	    }
	   
}


class Engine
{
	int engineid;
	int enginetype;
	public Engine(int engineid, int enginetype) {
		super();
		this.engineid = engineid;
		this.enginetype = enginetype;
	}
	
	
}

public class CarEngine {

	public static void main(String[] args) {
		
		
		Engine engine = new Engine(1234, 005);
		Car car = new Car(01, "Safari",engine );
		
		car.displayCarInfo();
	}

}
