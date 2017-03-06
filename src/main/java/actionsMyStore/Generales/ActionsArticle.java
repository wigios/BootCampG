package actionsMyStore.Generales;

import org.openqa.selenium.WebDriver;
import pageObjectMyStore.Generales.ArticleWindow;
import utils.Utils;

public class ActionsArticle {
	
	public WebDriver driver;
	
	public ActionsArticle(WebDriver driver){
		this.driver = driver;
	}
	
	public void AgregarArticuloCarrrito() throws InterruptedException {
		ArticleWindow article = new ArticleWindow(driver);
		article.AddtoCart.click();
		Utils.esperarSegundos(2);
	}

}
