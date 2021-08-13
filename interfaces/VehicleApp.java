package com.techment.interfaces;

public class VehicleApp {
	
	public static void main(String[] args)
	{
Vehicle vehicle1 = new HatchBack();
vehicle1.seatCapacity();

Vehicle vehicle2 = new XUV();
vehicle2.seatCapacity();

Vehicle vehicle3 = new Bike();
vehicle3.seatCapacity();
	}

}
