package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {//this is used for mandatory field.
	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		System.out.println("Step4");
		Assert.assertEquals(true, false);
		System.out.println("Step5");
		System.out.println("Step6");
	}
	@Test
	public void m2()
	{
		System.out.println("Step7");
		System.out.println("Step8");
		System.out.println("Step9");
		
	}

}
