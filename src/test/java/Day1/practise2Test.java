package Day1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practise2Test {
	@Test(groups= {"smoke"})
	public void logout() {
		System.out.println("machineloggingout");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first");
	}
	@AfterTest
	public void Teardown() {
		System.out.println("I will execute last");
	}
}
