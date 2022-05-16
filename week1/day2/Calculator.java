package week1.day2;

import week1.day1.Car;

public class Calculator {
	
	public int sum(int num1, int num2) {
		int sum = num1 +num2;
		return sum;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.sum(5, 3);
		System.out.println(sum);
		
		EmployeeDetails emp = new EmployeeDetails();
		Car car = new Car();
	}

}
