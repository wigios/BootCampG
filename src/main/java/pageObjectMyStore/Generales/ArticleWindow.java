package pageObjectMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleWindow {
	
	public WebDriver driver;
	
	public ArticleWindow(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(name="Submit")
    public WebElement AddtoCart; 


}
