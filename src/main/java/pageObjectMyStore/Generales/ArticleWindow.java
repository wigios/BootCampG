package pageObjectMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class ArticleWindow extends BasePage {
	
	public WebDriver driver;
	
	public ArticleWindow(WebDriver driver){
		super(driver);
	}
	
    @FindBy(name="Submit")
    public WebElement AddtoCart; 


}
