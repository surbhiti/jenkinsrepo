package testNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertex {//This is used for non mandatory field.
	@Test
		public void m1()
		{
			System.out.println("Step1");
			System.out.println("Step2");
			System.out.println("Step3");
			System.out.println("Step4");
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(true, false);
			System.out.println("Step5");
			System.out.println("Step6");
			soft.assertAll();
		}
		
			
		}



