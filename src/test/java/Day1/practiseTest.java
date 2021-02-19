package Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practiseTest {

	@BeforeMethod
	public void beforevery() {//cache
		System.out.println("beforevery");
	}
	@AfterMethod
	public void aftervery() {//cache
		System.out.println("beforevery");
	}
	@Parameters({"URL"})
	@Test
	public void login(String URLname) {
		System.out.println("hello");
		System.out.println(URLname);
	}
	@Test
	public void gift() {
		System.out.println("gift");
		int c=7;
		int b=0;
		int a=c/b;
		System.out.println(a);
		
	}
}
