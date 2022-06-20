package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority=1, enabled= false)
	public void createLead() {
		System.out.println("Create Lead");
		throw new RuntimeException();
	}
	
	@Test(priority = -2, dependsOnMethods = {"createLead", "duplicateLead"})
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(priority = 1, invocationCount = 5)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
	@Test
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}

}
