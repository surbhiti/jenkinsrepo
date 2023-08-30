package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderEx1 
{
	@Test(dataProvider="dataToExecute")
	public void bookFlightTickets(String src,String dest)
	{
		System.out.println("Book tickets from"+src+"to"+dest);
	}

@DataProvider
public Object[][] dataToExecute()
{
    Object[][] objarr = new Object[2][2];
    
    objarr[0][0]="Delhi";
    objarr[0][1]="Mumbai";
    
    objarr[1][0]="Delhi";
    objarr[1][1]="Kocchi";
	
    return objarr;
    
	

}









}
