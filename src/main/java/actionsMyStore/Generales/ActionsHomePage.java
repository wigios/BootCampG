package actionsMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjectMyStore.Generales.HomePage;
import utils.Utils;

public class ActionsHomePage {
	
	public WebDriver driver;
	
	public ActionsHomePage(WebDriver driver){
		this.driver = driver;
	}

	public void SeleccionarArticulo(String articulo) throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		
		switch (articulo) {
		case "Faded Short Sleeve T-shirts":
			homePage.ProductFadedShort.click();
			break;

		case "Printed Summer Dress":
			homePage.ProductPrintedSummer.click();
			break;
		}

		Utils.esperarSegundos(2);	
	}
	
}
