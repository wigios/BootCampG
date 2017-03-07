package pageObjectMyStore.shoppingCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class ShoppingCartDress extends BasePage {

	public WebDriver driver;

	public ShoppingCartDress(WebDriver driver) {
		super(driver);
	}

	// ActionsSCWindow00
	@FindBy(xpath = "//div[@id='layer_cart']/div/div[2]/div[4]/a/span")
	public WebElement btnCheckOut;

	// ActionsSCSummary01
	@FindBy(xpath = "//div[@id='center_column']/p[2]/a/span")
	public WebElement btnCartSummary;

	// Addresses03
	@FindBy(xpath = "//div[@id='center_column']/form/p/button")
	public WebElement btnChequearDireccion;

	// ShoppingCartShipping04
	@FindBy(id = "cgv")
	public WebElement chkTermsOfService;

	@FindBy(name = "processCarrier")
	public WebElement btnEnviado;

	// ShoppingCartPaymentMethod05
	@FindBy(xpath = "//div[@id='HOOK_PAYMENT']/div[2]/div/p/a")
	public WebElement lnkPayByCheck;

	// ActionsSCOrderSummary06
	@FindBy(xpath = "//p[@id='cart_navigation']/button")
	public WebElement btnCofirmOrder;

	// ActionsSCOrderConfirmation07
	@FindBy(xpath = "//div[@id='center_column']/p")
	public WebElement lblOrderComplete;

}
