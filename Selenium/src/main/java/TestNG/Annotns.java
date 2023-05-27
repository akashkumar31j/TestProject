package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotns {
	@BeforeTest
	public void bs()
	{
		System.out.println("BEFORE SUITE");
	}
	@BeforeMethod
	public void r()
	{
		System.out.println("AKASH+RAVIVANSHI");
	}
	@Test(dependsOnMethods=("t"),alwaysRun=true)
	public void a()
	{
		System.out.println("Akash");
	}
	@Test(dependsOnMethods = {"t1"})
	public void t()
	{
		Assert.fail("ASSERTION FAIL ");
		System.out.println("TEST CASE 0");
	}
	@Test(alwaysRun=true)
	public void t1()
	{
		//Assert.fail("ASERTION FAIL AGAIN");
		System.out.println("TEST CASE 1");
	}
	@Test(dependsOnMethods={"t" ,"a","t1"})
	public void a1()
	{
		System.out.println("RAVIVANSHI");
	}
@AfterTest
public void af()
{
	System.out.println("AFTER SUITE");
}
}
