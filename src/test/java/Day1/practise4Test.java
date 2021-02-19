package Day1;

import org.testng.annotations.Test;

public class practise4Test {
	@Test
	public void webbikeloan() {
		System.out.println("webbikeloan");
	}
	@Test(dependsOnMethods="webbikeloan")
	public void mobbikeloan() {
		System.out.println("mobbikeloan");
	}
	@Test(groups= {"smoke"})
	public void apibikeloan() {
		System.out.println("apibikeloan");
	}
}
