package Day1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Day2.loglive2;

public class practise5Test {
	private static Logger log =LogManager.getLogger(loglive2.class.getName());
	@Test(dataProvider= "SearchProvider")
	public void carrent(String username,String password) {
		System.out.println("car");
		System.out.println(username);
		System.out.println(password);
		log.info("i am pass");
	}
	
	@BeforeTest
	public void DupliBusinessrulesdeclare() {
		System.out.println("DupliBusinessrulesdeclare");
	}
	@AfterTest
	public void DupliBusinessrulesclose() {
		System.out.println("DupliBusinessrulesclose");
	}
	
	@DataProvider(name="SearchProvider")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="Senbiga";
		data[0][1]="pass1234";
		
		data[1][0]="Karthi";
		data[1][1]="pass5678";
		
		data[2][0]="mukunth";
		data[2][1]="pass4321";
		return data;
	}
}
