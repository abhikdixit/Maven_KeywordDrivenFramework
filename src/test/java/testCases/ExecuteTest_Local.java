package testCases;

import java.util.Properties;
import operation.ReadObject;
import operation.UIOperation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * THIS IS THE EXAMPLE OF KEYWORD DRIVEN TEST CASE
 *
 */
public class ExecuteTest_Local
{

	WebDriver dr = new ChromeDriver();
	ReadObject object = new ReadObject();
	UIOperation operation = new UIOperation(dr);
	@Test(priority=2)
	public void TC_001() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);

		operation.perform(allObjects,"GOTOURL", "", "", "url");
		operation.perform(allObjects,"SETTEXT", "username", "name", "admin");
		operation.perform(allObjects,"SETTEXT", "password", "name", "admin123");
		operation.perform(allObjects,"CLICK", "loginButton", "name", "");
		operation.perform(allObjects,"CLICK", "welcomeLink", "partiallink", "");
		Thread.sleep(3000);
		operation.perform(allObjects,"CLICK", "logoutLink", "link", "");
		operation.perform(allObjects,"CLOSEBROWSER", "", "", "");
	}
	
	/*@Test(priority=1)
	public void TC_002() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);

		operation.perform(allObjects,"GOTOURL", "", "", "urlGuru");
		operation.perform(allObjects,"SETTEXT", "Gusername", "name", "mngr325123");
		operation.perform(allObjects,"SETTEXT", "Gpassword", "name", "qUmaqAr");
		operation.perform(allObjects,"CLICK", "GloginButton", "name", "");
		//operation.perform(allObjects,"CLICK", "welcomeLink", "partiallink", "");
		Thread.sleep(3000);
		//operation.perform(allObjects,"CLICK", "logoutLink", "link", "");
		
	}*/
}
