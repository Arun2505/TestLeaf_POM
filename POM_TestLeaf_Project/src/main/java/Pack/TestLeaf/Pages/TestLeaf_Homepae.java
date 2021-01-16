package Pack.TestLeaf.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Pack.TestLeaf.TestCases.TestLeaf_TestBase;

public class TestLeaf_Homepae extends TestLeaf_TestBase {
	
	@FindBy(how = How.XPATH,using="(//div//div//div//ul/li)[1]")
	WebElement Click_CreateLead;
	
	@FindBy(how = How.ID,using="createLeadForm_companyName")
	WebElement Companyname;
	
	@FindBy(how = How.ID,using="createLeadForm_firstName")
	WebElement FirstName;
	
	@FindBy(how = How.ID,using="createLeadForm_lastName")
	WebElement LastName;
	
	@FindBy(how = How.XPATH,using="//input[@class=\"smallSubmit\"]")
	WebElement Submit_CreateLead;

	public TestLeaf_Homepae() {
		PageFactory.initElements(driver, this);
	}
	
	public void making_CreateLead(String CNmae,String FName,String Lname) {
		
		Click_CreateLead.click();
		Companyname.sendKeys(CNmae);
		FirstName.sendKeys(FName);
		LastName.sendKeys(Lname);
		Submit_CreateLead.click();
		
		
	}
}





