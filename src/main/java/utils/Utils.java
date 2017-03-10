package utils;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Browser;

public class Utils {

	public static WebDriver driver = null;

	public static void esperarSegundos(int segundos) {

		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static WebDriver openBrowser(String sBrowserName) {
		try {

			Browser browser;
			browser = Browser.valueOf(sBrowserName);

			switch (browser.ordinal()) {

			case 0:
				System.setProperty("webdriver.chrome.driver", "D://1_Documentos//Selenium//Drivers//chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				options.addArguments("--disable-extensions");
				driver = new ChromeDriver(options);
				String oldTab = driver.getWindowHandle();
				System.out.println(oldTab);
				break;

			case 1:
				System.setProperty("webdriver.gecko.driver", "D:\\1_Documentos\\Selenium\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;

			default:
				return null;

			}

			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

			String oldTab1 = driver.getWindowHandle();
			System.out.println(oldTab1);

		} catch (Exception e) {
			System.err.println("Error" + e.getMessage());
		}
		return driver;
	}

	public static void TomarEvidencia(WebDriver driver) {
		Calendar fecha = new GregorianCalendar();

		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);

		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);

		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			synchronized (scrFile) {
				FileUtils.copyFile(scrFile, new File("D://misProyectos//workspace//mystore.globant//FailEvidences//" + "Corrida_1" + "//" + anio + "_" + mes
						+ "_" + dia + "_" + hora + "_" + minuto + "_" + segundo + ".jpg"));
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(scrFile, new File("D:\\temp\\testScreenShot.jpg"));
	}

}
