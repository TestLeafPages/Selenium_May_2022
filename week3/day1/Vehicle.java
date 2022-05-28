package week3.day1;

public class Vehicle {
	
	public int mileage = 1000;

	public void applyBrake() {
		System.out.println("Apply Brake in parent class");
	}
	
	protected void soundHorn() {
		System.out.println("Sound Horn");
	}
}
