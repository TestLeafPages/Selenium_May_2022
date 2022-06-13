package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeInfo {
	
	int empId;
	String empName;
	
	EmployeeInfo(){
		this(100,"Hari");
	}
	
	EmployeeInfo(int id, String name){
		empId = id;
		empName = name;
	}

	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo();
		System.out.println(ei.empId);
		System.out.println(ei.empName);
		
		//WebDriver driver = new ChromeDriver();
		
		

	}

}
