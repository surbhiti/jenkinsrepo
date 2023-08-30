package generic_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import generic_utility.Execl_utility;
import generic_utility.File_utility;
import generic_utility.Java_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_Repository.Home1Page;
import pom_Repository.Login_page;

public class BaseClass {
	public Java_utility jlib = new Java_utility();
	public Execl_utility elib = new Execl_utility();
	public File_utility flib = new File_utility();
	
	public  WebDriver driver;
	public static WebDriver Sdriver;

	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void beforeSuite()
	{
		System.out.println("DataBase Connection");
	}
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void beforeTest()
	{
		System.out.println("Parallel Execution");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	//public void beforeClass(String BROWSER ) throws Throwable
	//{
		public void beforeClass() throws Throwable
		{	
		 
		String BROWSER = flib.getKeyAndValue("browser");
	    //WebDriver driver;
	    if(BROWSER.equalsIgnoreCase("chrome"))
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    }
	    else if(BROWSER.equalsIgnoreCase("edge"))
	    	
	    {
	    	WebDriverManager.edgedriver().setup();
	    	driver=new EdgeDriver();
	    	
	    }
	    
	    else {
	    	
	    	driver=new ChromeDriver();
	    }
	    Sdriver=driver;
	   
	    
		System.out.println("Launching Browser");
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void beforeMethod() throws Throwable
	{
		
		String URL = flib.getKeyAndValue("url");
		String UN = flib.getKeyAndValue("username");
	    String PW = flib.getKeyAndValue("pwd");
	    driver.get(URL);
	    Login_page login = new Login_page(driver);
	    login.LogInToVtiger(UN, PW);
	    driver.manage().window().maximize();
		System.out.println("Login to application");
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void afterMethod()
	{
		Home1Page home=new Home1Page(driver);
		home.logout(driver);
		System.out.println("Logout to application");
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void afterClass()
	{
		driver.quit();
		System.out.println("close Browser");
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void afterTest()
	{
		System.out.println("Parallel Execution done");
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void afterSuite()
	{
		System.out.println("DataBase Connection close");
	}
}

