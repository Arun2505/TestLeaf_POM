package Pack.TestLeaf.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pack.TestLeaf.Pages.TestLeaf_CRM_SFA_Page;
import Pack.TestLeaf.Pages.TestLeaf_Homepae;
import Pack.TestLeaf.Pages.TestLeaf_UserPage;

public class TestLeaf_HomePageTesting extends TestLeaf_TestBase {

	TestLeaf_UserPage userpae;
	TestLeaf_CRM_SFA_Page CRMpage;
	TestLeaf_Homepae home;

	public TestLeaf_HomePageTesting() {
		super();
	}

	@BeforeMethod
	public void launch() {
		Setup_Browse();

		userpae = new TestLeaf_UserPage();
		CRMpage = new TestLeaf_CRM_SFA_Page();
		home = new TestLeaf_Homepae();
	}

	@Test(priority = 1)
	public void Login() {
		userpae.userpage(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 2)
	public void ClickCRM() {
		userpae.userpage(prop.getProperty("username"), prop.getProperty("password"));
		CRMpage.CRM_Link();
	}

	@Test(priority = 3)
	public void CreatLead() {
		userpae.userpage(prop.getProperty("username"), prop.getProperty("password"));
		CRMpage.CRM_Link();

		home.making_CreateLead("BSS", "AK", "Arun");

	}

	@AfterMethod
	public void Close() {
		driver.close();
	}

}
