package Pack.TestLeaf.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Pack.TestLeaf.TestCases.TestLeaf_TestBase;

public class TestLeaf_CRM_SFA_Page extends TestLeaf_TestBase {
	
	
	@FindBy(how = How.PARTIAL_LINK_TEXT,using="CRM/SFA")
	WebElement Click_The_CRM_SFA;
	
	public TestLeaf_CRM_SFA_Page() {
		
		PageFactory.initElements(driver, this);
	}
	
	public TestLeaf_Homepae CRM_Link() {
		
		Click_The_CRM_SFA.click();
		
		return new TestLeaf_Homepae();
	}

}
