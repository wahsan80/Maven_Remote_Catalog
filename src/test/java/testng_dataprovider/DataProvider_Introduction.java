package testng_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Introduction {
	
	@Test(dataProvider = "getData")
	
	public void dataConcepts(String username, String password, int rollNumber, String browser) {
		
		
	}
	
	@DataProvider
	
	public Object[][] getData(){
		
		Object [][] data = new Object [3][4];
		
		data[0][0]= "username1";
		
	}

}
