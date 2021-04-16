package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriveCreator {
	
	public WebDriver createBrowser(String browser) {

		WebDriver driver;
		System.out.println("Var är jag?");
		if (browser.equals("chrome")) {
			System.out.println("Är jag här?");
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\mydrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\mydrivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else {
			System.setProperty("webdriver.edge.driver", "C:\\Eclipse\\mydrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;

	}

}
