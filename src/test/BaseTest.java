package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	static WebDriver driver;
	
	protected static void arrancarBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	protected static void buscarCancion(String string) {
		// TODO Auto-generated method stub
		
	}

	protected static void seleccionarCancion(String string) {
		// TODO Auto-generated method stub
		
	}

	protected static void cerrarNavegador() {
		// TODO Auto-generated method stub
		
	}

}
