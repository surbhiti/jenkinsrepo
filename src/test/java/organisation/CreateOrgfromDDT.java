package organisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Execl_utility;
import generic_utility.File_utility;
import generic_utility.Java_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

import pom_Repository.CreateOrg;
import pom_Repository.FindByslogin;
import pom_Repository.Home1Page;
import pom_Repository.Login_page;

public class CreateOrgfromDDT extends BaseClass {
@Test(groups={"smokeTest","regressionTest"})
	public  void createOrgfromDDT() throws Throwable {
		
		/*File_utility flib = new File_utility();
		String URL = flib.getKeyAndValue("url");
		String UN = flib.getKeyAndValue("username");
	    String PW = flib.getKeyAndValue("pwd");
		
		
		
		
		/*FileInputStream fis = new FileInputStream("./src/main/resources/data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String UN = pro.getProperty("username");
		String PW = pro.getProperty("pwd");*/
		/*WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		Login_page login = new Login_page(driver);
		login.LogInToVtiger(UN, PW);*/
		/*driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PW);
		driver.findElement(By.id("submitButton")).click();	*/	
		
		Java_utility jlib = new Java_utility();
		int ranno = jlib.getranno();
		
		/*Random ran = new Random();
		int ranno = ran.nextInt(1000);*/
		
		Execl_utility elib = new Execl_utility();
		String orgname = elib.getExcelData("Org", 0, 0)+ranno;
		/*FileInputStream fes = new FileInputStream("./src/main/resources/Vtiger.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Org");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String orgname = cell.getStringCellValue()+ranno;*/
		
		
		
		
		Thread.sleep(2000);
		String phn = elib.getExcelDataUsingDataformetter("org", 1, 0);
		/*Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(0);
		DataFormatter formatter = new DataFormatter();
		String phn = formatter.formatCellValue(cell1);*/
		
		
	
		
		Thread.sleep(2000);
		String Email = elib.getExcelDataUsingDataformetter("org", 2, 0);
		/*Row row2 = sheet.getRow(2);
		Cell cell2 = row2.getCell(0);
		DataFormatter formatter1 = new DataFormatter();
		String Email = formatter1.formatCellValue(cell2);*/;
		
		//driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		Home1Page home = new Home1Page(driver);
		home.organizationLink();
		/*driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.id("phone")).sendKeys(phn);
		driver.findElement(By.id("email1")).sendKeys(Email);*/
		CreateOrg CO = new CreateOrg(driver);
		CO.CreateOrganisation(orgname, phn, Email);
		
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		//validation
		
		/*String actdata = driver.findElement(By.xpath("//td[@id='mouseArea_Organization Name']")).getText();
		
		if(actdata.contains(orgname))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");*/
		
		Thread.sleep(2000);
		//home.logout(driver);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
		
	}

}
