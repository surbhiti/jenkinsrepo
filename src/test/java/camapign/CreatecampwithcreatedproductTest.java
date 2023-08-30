package camapign;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Execl_utility;
import generic_utility.File_utility;
import generic_utility.Java_utility;
import generic_utility.Webdriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom_Repository.Campwithproductpage;
import pom_Repository.CreateProductPage;
import pom_Repository.Createcampaignpage;
import pom_Repository.Home1Page;
import pom_Repository.Login_page;

import org.openqa.selenium.WebDriver;
public class CreatecampwithcreatedproductTest extends BaseClass{//cannot extends the base class

@Test
		public  void createcampwithcreatedproduct() throws Throwable {
			/*WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			File_utility flib = new File_utility(); 
			String URL = flib.getKeyAndValue("url");
			String UN = flib.getKeyAndValue("username");
			String PW = flib.getKeyAndValue("pwd");
			/*FileInputStream fis = new FileInputStream("./src/main/resources/data.properties");
			Properties pro = new Properties();
			pro.load(fis);
			String URL = pro.getProperty("url");
			String UN = pro.getProperty("username");
			String PW = pro.getProperty("pwd");
			driver.get(URL);
			Login_page login = new Login_page(driver);
			login.LogInToVtiger(UN,PW);*/
			/*driver.findElement(By.name("user_name")).sendKeys(UN);
			driver.findElement(By.name("user_password")).sendKeys(PW);
			driver.findElement(By.id("submitButton")).click();*/
			
	     
			
			Thread.sleep(2000);
	        //driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
	        Java_utility jlib = new Java_utility();
	        int ranNum = jlib.getranno();
	        /*Random ran = new Random();
		    int ranNum = ran.nextInt(1000);*/
			
	        Execl_utility elib = new Execl_utility();
	        String ProductName = elib.getExcelDataUsingDataformetter("Products", 0, 0)+ranNum;
	       
			/*FileInputStream fes = new FileInputStream("./src/main/resources/Vtiger.xlsx");
			Workbook book = WorkbookFactory.create(fes);
			Sheet sheet = book.getSheet("Products");
			Row row = sheet.getRow(0);
		     Cell cell = row.getCell(0);
		    String ProductName = cell.getStringCellValue()+ranNum;*/
	       /* driver.findElement(By.linkText("Products")).click();
		    driver.findElement(By.name("productname")).sendKeys(ProductName);
		    Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])")).click();*/
	        Home1Page home = new Home1Page(driver);
	        home.productLink();
	       CreateProductPage pro = new CreateProductPage(driver);
	       pro.createProduct(ProductName);
		
	      
	       home.clickMoreLink(driver);
	       home.clickCamplink();
	     Createcampaignpage camp = new Createcampaignpage(driver);
	    camp.getPlusbutton().click();
	    
		 //driver.findElement(By.linkText("More")).click();
		 //driver.findElement(By.linkText("Campaigns")).click();
	       
		//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
	    Campwithproductpage campwithpro = new Campwithproductpage (driver);
		campwithpro.clickproductsign();
		//driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		Webdriver_utility wlib = new  Webdriver_utility();
		wlib.switchingWindow(driver, "Products&action");
		
		/*Set<String> allWindows = driver.getWindowHandles();
		 Iterator<String> id = allWindows.iterator();
		while(id.hasNext())
		{
			String win = id.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();
			
			if(title.contains("Products&action"))
			{
				break;
			}
			}*/
	
		
		//driver.findElement(By.xpath("//input[@name='search']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(ProductName);
		campwithpro.searchproduct(ProductName);
		campwithpro.clickonsearch();
		
		//    "+value+"
		//driver.findElement(By.xpath("//a[text()='"+ProductName+"']")).click();
		
		campwithpro.selectproduct(driver, ProductName);
		/*Set<String> allWindows1 = driver.getWindowHandles();
		Iterator<String> id1 = allWindows1.iterator();
		while(id1.hasNext())
		{
			String win = id1.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();
			
			if(title.contains("Campaigns&action"))
			{
				break;
			}
			}*/
		wlib.switchingWindow(driver, "Campaigns&action");
		
		/*FileInputStream fes1 = new FileInputStream("./src/main/resources/Vtiger.xlsx");
		Workbook book1 = WorkbookFactory.create(fes1);
		Sheet sheet1 = book1.getSheet("Campaigns");
		Row row1 = sheet1.getRow(0);
	    Cell cell1= row1.getCell(0);
	   String CampaginName = cell1.getStringCellValue()+ranNum;*/
	   String CampaginName = elib.getExcelDataUsingDataformetter("Campaigns", 0, 0)+ranNum;
	   
	   camp.getCamptext().sendKeys(CampaginName);
	  // driver.findElement(By.name("campaignname")).sendKeys(CampaginName);
	   camp.save();
	   
	  // driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])")).click();
		
	   Thread.sleep(2000);
	   
	   home.logout(driver);
		 /*driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		    driver.findElement(By.linkText("Sign Out")).click();*/
		}

	
	}


