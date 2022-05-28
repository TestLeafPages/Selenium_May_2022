package week3.day2;

import week3.day1.Vehicle;

public class Bike extends Vehicle{
	
	public void rideBike() {
		
	}
	
	public static void main(String[] args) {
		Bike myBike = new Bike();
		myBike.applyBrake();
		myBike.rideBike();
		myBike.soundHorn();
		
		Vehicle veh = new Vehicle();
		
	}
}
