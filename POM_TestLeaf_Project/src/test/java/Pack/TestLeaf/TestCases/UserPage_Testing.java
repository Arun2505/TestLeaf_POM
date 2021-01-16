package Pack.TestLeaf.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pack.TestLeaf.Pages.TestLeaf_UserPage;

public class UserPage_Testing extends TestLeaf_TestBase {
	
	TestLeaf_UserPage FronPage;
	
	
	public UserPage_Testing() {
		
		super();
	}
	
	@BeforeMethod
	public void LaunchBro() {
		Setup_Browse();
		
		FronPage = new TestLeaf_UserPage();
	}
	
	@Test
	public void usertest() {
		FronPage.userpage(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
