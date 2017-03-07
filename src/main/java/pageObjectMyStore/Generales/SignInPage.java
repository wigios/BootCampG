package pageObjectMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class SignInPage extends BasePage {
	
	public WebDriver driver;
	
	public SignInPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="email")
    public WebElement email;
    
    @FindBy(id="passwd")
    public WebElement passwd;    
    
    @FindBy(id="SubmitLogin")
    public WebElement btnLogin;  
  
}
