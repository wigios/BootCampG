package actionsMyStore.Generales;

import org.openqa.selenium.WebDriver;
import pageObjectMyStore.Generales.SignInPage;
import utils.Utils;

public class ActionsSignIn {

	public WebDriver driver;
	
	public ActionsSignIn(WebDriver driver){
		this.driver = driver;
	}
	
	public void IngresoLogin(String correo, String pass) throws InterruptedException {
		
		SignInPage signinPage = new SignInPage(driver);
		
		signinPage.email.sendKeys(correo);
		signinPage.passwd.sendKeys(pass);
		signinPage.btnLogin.click();
		Utils.esperarSegundos(2);

	}

}
