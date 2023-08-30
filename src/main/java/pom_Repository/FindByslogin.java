package pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindByslogin {
	public FindByslogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="user_name")
	private WebElement usertext;
	
	@FindBys({@FindBy(xpath="//input[@type='password']"),@FindBy(name="user_password")})
	private WebElement pwdtext;
	
	@FindAll({@FindBy(xpath="//input[@type='submit']"),@FindBy(id="submitButton")})
	private WebElement submit;

	public WebElement getUsertext() {
		return usertext;
	}

	public WebElement getPwdtext() {
		return pwdtext;
	}

	public WebElement getSubmit() {
		return submit;
	}
	//Buisness logic
	public void LogInToVtiger(String UN,String PW )
	{
		usertext.sendKeys(UN);
		pwdtext.sendKeys(PW);
		submit.click();
		
	}

	

}
