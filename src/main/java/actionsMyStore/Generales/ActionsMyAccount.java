package actionsMyStore.Generales;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjectMyStore.Generales.MyAccountPage;
import utils.Utils;

public class ActionsMyAccount {
	
	public WebDriver driver;
	
	public ActionsMyAccount(WebDriver driver){
		this.driver = driver;
	}

	public void IngresarHomePage() throws InterruptedException {
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.btnHome.click();
		Utils.esperarSegundos(6);
	}
	
	public void CerrarSesion(){
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.btnSignOut.click();
	}

}
