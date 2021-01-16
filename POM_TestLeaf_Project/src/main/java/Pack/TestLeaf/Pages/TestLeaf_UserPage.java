package Pack.TestLeaf.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Pack.TestLeaf.TestCases.TestLeaf_TestBase;

public class TestLeaf_UserPage extends TestLeaf_TestBase {
	
	
	@FindBy(how = How.ID,using="username")
	WebElement username;
	
	@FindBy(how = How.ID,using="password")
	WebElement password;
	
	@FindBy(how = How.CLASS_NAME,using="decorativeSubmit")
	WebElement Submit_Button;
	
	public TestLeaf_UserPage() {
		PageFactory.initElements(driver, this);
	}
	
	public TestLeaf_CRM_SFA_Page userpage(String un,String Pwd) {
		username.sendKeys(un);
		password.sendKeys(Pwd);
		Submit_Button.click();
		
		return new TestLeaf_CRM_SFA_Page();
		
	}

}
