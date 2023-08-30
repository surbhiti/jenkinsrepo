package organisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganisation {
	//what is the issue not able to save , have u deleted any folder in localdisk =---no---actually 

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("Wipro12345");
		driver.findElement(By.id("phone")).sendKeys("9878987689");
		driver.findElement(By.id("email1")).sendKeys("kavita@gmail.com");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		/*Thread.sleep(2000);
		WebElement AdminImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(2000);
		
		
		Webdriver_utility wlib = new Webdriver_utility ();
		wlib.actionClass(driver, AdminImg);
		
         driver.findElement(By.linkText("Sign Out")).click();
		
		System.out.println("Logout successfull");*/
	}
	
}
