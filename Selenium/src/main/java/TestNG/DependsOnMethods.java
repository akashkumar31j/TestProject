package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void uday437()
	{
		System.out.println("UDAY");
		//Assert.fail("skip due to uday");
	}
	@Test(dependsOnMethods=("venkatesh443"),alwaysRun=true)
	public void prudvi436()
	{
		System.out.println("PRUDVI");
	}
	@Test(dependsOnMethods=("uday437"))
	public void akash407()
	{
		System.out.println("AKASH");
	}
	@Test(dependsOnMethods =("akash407"))
	public void venkatesh443()
	{
		System.out.println("PILLI");
	}
		@Test(dependsOnMethods =("akash407"))
		public void madhu445()
		{
			System.out.println("tod tod tuusss");

	}
}
