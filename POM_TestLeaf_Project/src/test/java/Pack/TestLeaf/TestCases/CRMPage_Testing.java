package Pack.TestLeaf.TestCases;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pack.TestLeaf.Pages.TestLeaf_CRM_SFA_Page;
import Pack.TestLeaf.Pages.TestLeaf_UserPage;

public class CRMPage_Testing extends TestLeaf_TestBase {
	
	TestLeaf_UserPage userpae;
	TestLeaf_CRM_SFA_Page CRMpage;
	
	public CRMPage_Testing() {
		super();
	}
	
	
	
	@BeforeMethod
	public void LaunchBro() {
		
		Setup_Browse();
		userpae=new TestLeaf_UserPage();
		CRMpage= new TestLeaf_CRM_SFA_Page();
	}
	
	@Test()
	public void Loginpage() {
		userpae.userpage(prop.getProperty("username"),prop.getProperty("password"));
		CRMpage.CRM_Link();
	}

	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
