package practice;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_utility.Execl_utility;
import generic_utility.Java_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderVtiger {
@Test(dataProvider="getData")
public void launchVtiger(String orgName,String phn,String mail) throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	driver.findElement(By.id("phone")).sendKeys(phn);
	driver.findElement(By.id("email1")).sendKeys(mail);
	
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	Thread.sleep(2000);
     driver.findElement(By.linkText("Sign Out")).click();
	
driver.quit();

}
@DataProvider
public Object[][]getData()

{
	
	/*Random ran = new Random();
	int ranNum = ran.nextInt(1000);*/
	Java_utility jlib = new Java_utility();
	int ranNum = jlib.getranno();
	
	/*Execl_utility elib = new Execl_utility();
	String orgName=elib.getExcelDataUsingDataformetter("DataProvider", 0, 0);
	String phn=elib.getExcelDataUsingDataformetter("DataProvider", 0, 1);
	String mail=elib.getExcelDataUsingDataformetter("DataProvider", 0, 2);*/
	Object[][] objarr = new Object[3][3];
	
	
	
	objarr[0][0]="Testyantra"+ranNum;
	objarr[0][1]="9098556194";
	objarr[0][2]="Test@gmail.com";
	
	objarr[1][0]="GateCoach"+ranNum;
	objarr[1][1]="9098556194";
	objarr[1][2]="Gate@gmail.com";
	
	objarr[2][0]="Wipro"+ranNum;
	objarr[2][1]="9098556194";
	objarr[2][2]="wipro@gmail.com";
	
	return objarr;
	}














}
