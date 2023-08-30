package pom_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campwithproductpage {

	public Campwithproductpage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement productsign;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement search;

	public WebElement getProductsign() {
		return productsign;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	//Buisness Logic
	

	
public void clickproductsign()
{
	productsign.click();
}

public void searchproduct(String ProductName)
{
	searchbox.sendKeys(ProductName);
}
public void clickonsearch()
{
	search.click();
}

public void selectproduct(WebDriver driver,String ProductName)
{
	driver.findElement(By.xpath("//a[text()='"+ProductName+"']")).click();

}

	
	
	
	
	
	
	
	
}
