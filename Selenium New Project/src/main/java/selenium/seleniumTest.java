package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

	public static void main(String[] args) {
		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dashboard.botlers.io/organizaciones");
		
	}

}
