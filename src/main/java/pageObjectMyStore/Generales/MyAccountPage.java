package pageObjectMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class MyAccountPage  extends BasePage {
	
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver){
		super(driver);
	}
	
    @FindBy(xpath="//div[@id='columns']/div/a/i")
    public WebElement btnHome; 

    @FindBy(linkText="Sign out")
    public WebElement btnSignOut; 
    
}
