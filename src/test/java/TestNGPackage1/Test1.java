package TestNGPackage1;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite
	public void doEnvSetUP(){
		System.out.println("Setting up the environment");
	}
	
	@BeforeTest
	public void startWebDriver(){
		System.out.println("Starting the webdriver");
	}
	
	@BeforeMethod
	public void openWebsite(){
		System.out.println("opening the website");
	}
	
	@Test
	public void doLogin(){
		//call login
		System.out.println("performing the login operation");
	}
	

	@Test
	public void doLogout(){
		//call login
		System.out.println("performing the logout operation");
	}
	
	@Test
	public void doFillRegistrationform(){
		//call login
		System.out.println("filling the registration form ");
		Assert.fail();
	}
	
	@AfterMethod
	public void closeWebsite(){
		System.out.println("closing the website");
	}
	
	@AfterTest
	public void closeWebDriver(){
		System.out.println("Closing the webdriver");
	}
	
	@AfterSuite
	public void releaseResources(){
		System.out.println("Released the resources");
	}

}
