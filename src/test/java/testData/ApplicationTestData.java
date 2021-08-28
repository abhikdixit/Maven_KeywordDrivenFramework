package testData;

import org.testng.annotations.DataProvider;


public class ApplicationTestData {
	
	@DataProvider(name="Login")
	public Object[][] getDataFromDataprovider(){

	    return new Object[][] {

			{"Admin", "admin123"},
			{"dixit", "admin123" },
			{"kumar", "admin123" }

	            };
	}
	
	@DataProvider(name="Search")
	public Object[][] SearchDataprovider(){

	    return new Object[][] {

	            {"Paris", "London"},

	            {"New York", "Portland" }

	            };
	}
	
	//-------------------------------------------- This is to read Excel Data------------
	
/*	@DataProvider(name = "LoginData")
	public Object[][] Authentication() throws Exception{
		ReadExcel excel = new ReadExcel();
		Object[][] testObjArray = excel.getExcelData("D:\\F Drive\\Selenium Training Data\\workspace\\Selenium_WebDriver_3.9\\FlightTestData.xls","TestData");
		System.out.println(testObjArray);
	     return testObjArray;
	     
		}*/
}
