package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practise3Test {
	
	@BeforeClass
	public void classfirst(){
		System.out.println("execute first per class");
	}
	@AfterClass
	public void classlast(){
		System.out.println("execute last per class");
	}
	@Test(groups= {"smoke"})
	public void webcarloan() {
		System.out.println("webcarloan");
	}
	@Test(enabled=false)
	public void mobcarloan() {
		System.out.println("mobcarloan");
	}
	@Test(timeOut=5000)
	public void mobdocuments() {
		System.out.println("mobdocument");
	}
	@Parameters({"URL","Username"})
	@Test
	public void apicarloan(String urlcar,String username) {
		System.out.println("apicarloan");
		System.out.println(urlcar);
		System.out.println(username);
	}

	
	
}
