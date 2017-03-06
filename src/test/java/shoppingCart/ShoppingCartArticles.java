package shoppingCart;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import chain.ShoppingChain;
import utils.ExcelUtils;
import utils.Utils;

public class ShoppingCartArticles {

	public WebDriver driver;

	public String resultExpected;
	public String resultObtenido;
	
	public ShoppingChain shoppingChain; 
	public boolean validador;
	
	public ShoppingCartArticles() {
		this.resultExpected = "Your order on My Store is complete.";
		validador = false;
	}
	
	@Parameters("browser")
	@Test
	public void launchDriverChain(String browser) throws InterruptedException{
		
		driver = Utils.openBrowser(browser);
		shoppingChain = new ShoppingChain(driver);
		resultObtenido = shoppingChain.launchShooping();
		
		Assert.assertEquals(resultExpected, resultObtenido);
		
		validador = true;
	
	}
	
	@AfterMethod
	public void ValidatTest(){
		if(!validador)
			Utils.TomarEvidencia(driver);	 

		try {
			ExcelUtils.setCellData("Passed", 1, 3, "DataTestPractice.xlsx");
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	@AfterTest
	public void Terminacion() throws Exception {
		shoppingChain.closePage();
		System.out.println("El Proceso ha terminado");

	}

}
