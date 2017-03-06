package actionsMyStore.shoppingCart;

import org.openqa.selenium.WebDriver;

import pageObjectMyStore.shoppingCart.ShoppingCartDress;
import utils.Utils;

public class ActionsShoppingDress {
	
	public WebDriver driver;
	
	public ActionsShoppingDress(WebDriver driver){
		this.driver = driver;
	}
	
	public void ProceedtoCheckOut() throws InterruptedException {
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		scDress.btnCheckOut.click();
		Utils.esperarSegundos(2);
	}

	public void AgregarArticuloCarrrito() throws InterruptedException {
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		scDress.btnCartSummary.click();
		Utils.esperarSegundos(2);
		}

	public void ValidarDireccion() throws InterruptedException {
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		scDress.btnChequearDireccion.click();
		Utils.esperarSegundos(2);	
	}
	
	public void ConfirmarOrden() throws InterruptedException {
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		scDress.btnCofirmOrder.click();
		Utils.esperarSegundos(2);
	}

	public void SeleccionarMetodoPago() throws InterruptedException {
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		scDress.lnkPayByCheck.click();
		Utils.esperarSegundos(2);
	}
	
	public void EnviarArticulos() throws InterruptedException {
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		scDress.chkTermsOfService.click();
		scDress.btnEnviado.click();
		Utils.esperarSegundos(3);	
	}

	public String ConfirmarPago() {
		String resultadoObtenido = "";
		ShoppingCartDress scDress = new ShoppingCartDress(driver);
		resultadoObtenido = scDress.lblOrderComplete.getText();
		
		return resultadoObtenido;
	}

}
