package camapign;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.Execl_utility;
import generic_utility.File_utility;
import generic_utility.Java_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

import pom_Repository.CreateOrg;
import pom_Repository.Createcampaignpage;
import pom_Repository.FindByslogin;
import pom_Repository.Home1Page;

import pom_Repository.Login_page;



public class Campaigns extends BaseClass {

	@Test(groups="smokeTest")
		public void campaigns() throws Throwable
		{
	//launching browser
		/*WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();*/
		
		//login to application
		/*File_utility flib = new File_utility();
		String URL = flib.getKeyAndValue("url");
		String UN = flib.getKeyAndValue("username");
	    String PW = flib.getKeyAndValue("pwd");
	    driver.get(URL);
	    Login_page login = new Login_page(driver);
	    login.LogInToVtiger(UN, PW);*/
		
		Home1Page home=new Home1Page(driver);
	    home.clickMoreLink(driver);
	    home.clickCamplink();
	    Java_utility jlib = new Java_utility();
		int ranno = jlib.getranno();
		Execl_utility elib = new Execl_utility();
		String campname = elib.getExcelData("Campaigns", 0, 0)+ranno;
		Createcampaignpage Camp = new Createcampaignpage(driver);
		Camp.CreateCampaigns(campname);
		//home.logout(driver);
		
	}
	
	@Test(groups={"smokeTest","regressionTest"})
	public  void createOrgfromDDT() throws Throwable {
		
		
		
		Java_utility jlib = new Java_utility();
		int ranno = jlib.getranno();
		
		
		Execl_utility elib = new Execl_utility();
		String orgname = elib.getExcelData("Org", 0, 0)+ranno;
		
		
		
		
		Thread.sleep(2000);
		String phn = elib.getExcelDataUsingDataformetter("org", 1, 0);
		
		
	
		
		Thread.sleep(2000);
		String Email = elib.getExcelDataUsingDataformetter("org", 2, 0);
		
		Home1Page home = new Home1Page(driver);
		home.organizationLink();
		CreateOrg CO = new CreateOrg(driver);
		CO.CreateOrganisation(orgname, phn, Email);
		
		Thread.sleep(2000);
		
	}

}
