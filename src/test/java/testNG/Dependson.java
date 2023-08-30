package testNG;

import org.testng.annotations.Test;

public class Dependson
{
	@Test
	public void CreateProduct()
	{
		System.out.println("Product created");
	}
	@Test(dependsOnMethods="CreateProduct")
	public void modifyProduct()
	{
		System.out.println("Product modified");
	}
	@Test(dependsOnMethods="CreateProduct")
	public void deleteProduct()
	{
		System.out.println("Product deleted");
	}
}
