package products;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Execl_utility;
import generic_utility.File_utility;
import generic_utility.Java_utility;
import generic_utility.Webdriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

import pom_Repository.CreateProductPage;
import pom_Repository.Home1Page;
import pom_Repository.Login_page;

public class CreateProduct extends BaseClass {
@Test(groups={"smokeTest","regressionTest"})
	public void createProduct() throws Throwable {
		
		/*File_utility flib = new File_utility();
		String URL=flib.getKeyAndValue("url");
		String UN=flib.getKeyAndValue("username");
		String PW=flib.getKeyAndValue("pwd");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Login_page login = new Login_page(driver);
		login.LogInToVtiger(UN, PW);
		/*driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PW);
		driver.findElement(By.id("submitButton")).click();*/
		
		
	
		int ranno = jlib.getranno();
		
		
		String exceldata = elib.getExcelDataUsingDataformetter("Products", 0, 0);
		
		String proname = exceldata+ranno;
		
		
		
		/*WebElement ele = driver.findElement(By.linkText("vtiger.com"));
		
		Thread.sleep(2000);
		
		//Webdriver_utility wlib = new Webdriver_utility ();
		//wlib.scrollPage(driver, ele);
		
		
	    Thread.sleep(2000);
		*/
		
		//driver.findElement(By.linkText("Products")).click();
		Home1Page home = new Home1Page(driver);
		home.productLink();
		/*driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(proname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();*/
	CreateProductPage CP = new CreateProductPage(driver);
	CP.createProduct(proname);
     //home.logout(driver);
		/*driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();*/
		
	}
}
