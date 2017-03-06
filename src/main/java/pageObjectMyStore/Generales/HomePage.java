package pageObjectMyStore.Generales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
		
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")    
    public WebElement ProductFadedShort; 

    @FindBy(xpath="(//img[@alt='Printed Summer Dress'])[2]s")    
    public WebElement ProductPrintedSummer; 
}
