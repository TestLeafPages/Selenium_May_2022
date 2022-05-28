package week3.day1;

public class Car extends Vehicle{
	/*
	 * 1. Memory usage - We are avoiding object
	 * creation for parent class
	 * 2. All common methods/ variables can be put into parent
	 * class
	 */
	public void driveCar() {
		System.out.println("Drive Car");
	}
	
	public void applyBrake() {
		System.out.println("Apply Brake in child class");
	}
	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		veh.soundHorn();
		
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBrake();
		myCar.soundHorn();
		System.out.println(myCar.mileage);
	}

}
