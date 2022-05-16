package week1.day2;

public class EmployeeDetails {
	
	// arguments
	public void getEmployeeDetails(String empName, int empId) {
		System.out.println(empName + "-"+ empId);
	}
	
	public String getAddress() {
		String address = "21, Main Road, Chennai";
		return address;
	}

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails();
		emp.getEmployeeDetails("Haja", 1001);
		// cntrl + 2, L
		String address = emp.getAddress();
		System.out.println(address);
	}

}
