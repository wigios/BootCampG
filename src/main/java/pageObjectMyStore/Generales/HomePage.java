package pageObjectMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class HomePage  extends BasePage {
	
	public WebDriver driver;
		
	public HomePage(WebDriver driver){
		super(driver);
	}
	
    @FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")    
    public WebElement ProductFadedShort; 

    @FindBy(xpath="(//img[@alt='Printed Summer Dress'])[2]s")    
    public WebElement ProductPrintedSummer; 
}
