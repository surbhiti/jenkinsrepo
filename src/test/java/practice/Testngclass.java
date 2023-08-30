package practice;

import org.testng.annotations.Test;


public class Testngclass {
@Test(priority=1)
		public void m1()
		{
			System.out.println("TestNG");
		}
@Test(priority=2)
	public void m2()
	{
		System.out.println("HII");
	}
@Test(enabled=false)//not to execute method
  public void m3()
{
	System.out.println("Hello");
}
@Test(priority=3)
public void m4()
{
	System.out.println("Welcome");
}
@Test(invocationCount=5)//to execute multiple times
public void m5()
{
	System.out.println("surbhi");
}
	}


