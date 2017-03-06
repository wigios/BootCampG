package chain;

import org.openqa.selenium.WebDriver;
import actionsMyStore.Generales.ActionsArticle;
import actionsMyStore.Generales.ActionsHomePage;
import actionsMyStore.Generales.ActionsMyAccount;
import actionsMyStore.Generales.ActionsSignIn;
import actionsMyStore.shoppingCart.ActionsShoppingDress;
import utils.ExcelUtils;

public class ShoppingChain {
	
	public WebDriver driver;
	public String correo;
	public String pass;
	public String article;
	
	public boolean valido;
	public String resultExpected;
	public String resultObtenido;
	
	public ActionsSignIn actionsSignIn;
	public ActionsMyAccount actionsMyAccount;
	public ActionsHomePage actionsHomePage;
	public ActionsArticle actionsArticle;
	public ActionsShoppingDress scDress;
	
	public ShoppingChain(WebDriver driver){
		this.driver = driver;
		actionsSignIn = new ActionsSignIn(driver);
		actionsMyAccount = new ActionsMyAccount(driver);
		actionsHomePage = new ActionsHomePage(driver);
		actionsArticle = new ActionsArticle(driver);
		scDress = new ActionsShoppingDress(driver);
	
		valido =  false;
		
		try {
			ExcelUtils.setExcelFile("D://misProyectos//workspace//mystore.globant//DataTestPractice.xlsx", "Hoja1");
			
			this.correo = ExcelUtils.getCellData(1, 0);
			this.pass = ExcelUtils.getCellData(1, 1);
			this.article = ExcelUtils.getCellData(1, 2);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		this.resultObtenido = "";
	}
	
	public void closePage() throws InterruptedException {
		actionsMyAccount.CerrarSesion();
	}
	
	public String launchShooping() throws InterruptedException {

		actionsSignIn.IngresoLogin(correo, pass);

		actionsMyAccount.IngresarHomePage();
	    
		actionsHomePage.SeleccionarArticulo(article);

		actionsArticle.AgregarArticuloCarrrito();		

		scDress.ProceedtoCheckOut();

		scDress.AgregarArticuloCarrrito();

		scDress.ValidarDireccion();

		scDress.EnviarArticulos();

		scDress.SeleccionarMetodoPago();
		
		scDress.ConfirmarOrden();
		
		resultObtenido = scDress.ConfirmarPago();
		
		return resultObtenido;
		
	}

}
