package TestNGPackage1;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	
	@BeforeMethod
	public void skipTestCase(){
		throw new SkipException("skipping the test case");
	}
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password){
		System.out.println("Username is " +username+" and password is "+password);
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		data[0][0] = "User1";
		data[0][1] = "Pass1";
		
		data[1][0] = "User2";
		data[1][1] = "Pass2";
		
		data[2][0] = "User3";
		data[2][1] = "pass3";
		
		return data;
	}
	
	

}
