package weekend;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Encryptdecrypt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		String encryptUN = new String(Base64.getEncoder().encode("admin".getBytes()));
		String encryptPW = new String(Base64.getEncoder().encode("admin".getBytes()));
		String decryptUN = new String(Base64.getDecoder().decode(encryptUN.getBytes()));
		String decryptPW = new String(Base64.getDecoder().decode(encryptPW.getBytes()));
		
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys(decryptUN);
		driver.findElement(By.name("user_password")).sendKeys(decryptPW);
		driver.findElement(By.id("submitButton")).click();

	}

}
