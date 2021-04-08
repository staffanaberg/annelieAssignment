package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinition {

	private WebDriver driver;
	private Random rand = new Random();

	@Given("I have used {string} as a browser")
	public void i_have_used_browser_as_a_browser(String browser) {
		DriveCreator creator = new DriveCreator();
		driver = creator.createBrowser(browser);
		driver.get("https://login.mailchimp.com/signup/");
		driver.manage().window().maximize();
		WebElement addButton = driver.findElement(By.cssSelector("button[id=onetrust-accept-btn-handler]"));
		addButton.click();

	}

	@Given("I have entered {string} as an email")
	public void i_have_entered_email_as_an_email(String email) {
		WebElement addFirst = driver.findElement(By.cssSelector("input[type=email]"));
		addFirst.sendKeys(email);

	}

	@Given("I have also entered {string} as a username and chosen {string}")
	public void i_have_also_entered_username_as_a_username(String username, String random) {
		if (random.equals("yes")) {
			WebElement addFirst = driver.findElement(By.cssSelector("input[id=new_username]"));
			addFirst.sendKeys(username + rand.nextInt(2147483647));

		}

		else {
			WebElement addFirst = driver.findElement(By.cssSelector("input[id=new_username]"));
			addFirst.sendKeys(username);
		}
	}

	@Given("I have also entered {string} as a password")
	public void i_have_also_entered_password_as_a_password(String password) {
		WebElement addFirst = driver.findElement(By.cssSelector("input[type=password]"));
		addFirst.sendKeys(password);

	}

	@When("I click sign up")
	public void i_click_sign_up() {
		WebElement addButton = driver.findElement(By.cssSelector("button[id=create-account]"));
		addButton.click();

	}

	@Then("the registration should {string} and I verify {string}")
	public void the_registration_should_and_i_verify(String status, String message) {
		if (status.equals("pass")) {
			WebElement result = driver.findElement(By.cssSelector("body[id=login]"));
			driver.quit();

		} else if (status.equals("fail limit")) {
			WebElement result = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/main/div[2]/div/form/fieldset/div[2]/div/span"));
			driver.quit();

		} else if (status.equals("fail existing")) {
			WebElement result = driver.findElement(
					By.xpath("/html/body/div[2]/div[1]/div/main/div[2]/div/form/fieldset/div[2]/div/span"));
			driver.quit();

		}

		else {
			WebElement result = driver.findElement(
					By.xpath("/html/body/div[2]/div[1]/div/main/div[2]/div/form/fieldset/div[1]/div/span"));
			driver.quit();
		}

	}

}
