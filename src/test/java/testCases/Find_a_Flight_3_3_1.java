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
public class Find_a_Flight_3_3_1 {

    WebDriver webdriver = new ChromeDriver();
     ReadObject object = new ReadObject();
     UIOperation operation = new UIOperation(webdriver);
    @Test
	public void testLogin() throws Exception {
        Properties allObjects =  object.getObjectRepository();
        //Read keyword sheet
        //operation.perform(p, operation, objectName, objectType, value);

        operation.perform(allObjects,"GOTOURL", "", "", "url");
        operation.perform(allObjects,"CLICK", "SignonLink", "link", "");
        operation.perform(allObjects,"SETTEXT", "username", "name", "testing");
        operation.perform(allObjects,"SETTEXT", "password", "name", "testing");
        operation.perform(allObjects,"CLICK", "loginButton", "name", "");
        operation.perform(allObjects,"SELECTRADIOBUTTON", "TripTypeOneWay", "xpath", "");
        operation.perform(allObjects,"SELECTDROPDOWNVALUE", "AirlineObject", "name", "Unified Airlines");
        webdriver.quit();
    }
}
