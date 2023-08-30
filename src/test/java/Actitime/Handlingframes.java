package Actitime;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver ;
public class Handlingframes {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html ");
	//switch to frame
	
	/*driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surbhi");*/
	
	
	//here frame we write locator of frame by id
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("surbhi");
	
	//switch back from frame
	
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	
		

	}

}
