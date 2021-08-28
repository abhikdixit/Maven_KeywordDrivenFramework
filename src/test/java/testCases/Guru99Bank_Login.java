package testCases;

import java.util.Properties;
import operation.ReadObject;
import operation.UIOperation;
import testData.ApplicationTestData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * THIS IS THE EXAMPLE OF KEYWORD DRIVEN TEST CASE
 *
 */
public class Guru99Bank_Login
{

	WebDriver dr = new ChromeDriver();
	ReadObject object = new ReadObject();
	UIOperation operation = new UIOperation(dr);
	@Test
	public void TC_001() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);

		operation.perform(allObjects,"GOTOURL", "", "", "urlGuru");
		operation.perform(allObjects,"SETTEXT", "Gusername", "name", "mngr298559");
		operation.perform(allObjects,"SETTEXT", "Gpassword", "name", "hUdEhYv");
		operation.perform(allObjects,"CLICK", "GloginButton", "name", "");
		
	}
	
}
