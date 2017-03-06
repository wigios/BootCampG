package pageObjectMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public WebDriver driver;
	
	public SignInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
    public WebElement email;
    
    @FindBy(id="passwd")
    public WebElement passwd;    
    
    @FindBy(id="SubmitLogin")
    public WebElement btnLogin;  
  
}
