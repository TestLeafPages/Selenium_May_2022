package week1.day1;

public class Car {
	
	// Variables
	short maxSpeed = 140;
	byte seatingCapacity = 4;
	int price = 800000;
	long ownerMobile = 9876543210L;
	
	float mileage = 20.5f;
	double distanceCovered = 142623.356;
	
	char fuelType = 'D';
	
	boolean isPetrolEngine = false;
	
	
	// Comments
	// method -> actions/ verifications
	// drive car
	
	// access modifier, return type, methodName
	public void driveCar() {
		int regNumber = 12456;
		fuelType = 'P';
		System.out.println(fuelType);
		System.out.println(regNumber);
		System.out.println("Drive the Car");
	}
	
	// Price = 800000
	public void applyBrake() {
		System.out.println("Price = " + price);
		System.out.println(fuelType);
		System.out.println("Apply Brake");
		driveCar();
	}
	// special method - main method
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		// Create an object
		Car myCar = new Car();
		myCar.applyBrake();
		myCar.driveCar();
		
		
		System.out.println(myCar.price);
		
	}
	
}