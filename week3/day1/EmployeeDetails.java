package week3.day1;

public class EmployeeDetails {
	
	static int empId;
	String empName;
	
	public EmployeeDetails(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
		System.out.println("In Parametrized Constructor");
	}
	
	public EmployeeDetails(){
		empId = 1001;
		empName = "Haja";
		System.out.println("In Default Constructor");
	}
	
	public static void getEmployeeDetails() {
		System.out.println(empId);
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		
//		EmployeeDetails emp = new EmployeeDetails(101, "Babu");
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
		
		EmployeeDetails.getEmployeeDetails();
		System.out.println(EmployeeDetails.empId);
	}

}
