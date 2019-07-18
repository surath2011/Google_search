package stepdefinations;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class search {
	WebDriver driver;
	Properties data; 
	@Given("^browser is opened$")
	public void browser_is_opened() throws Throwable {
		System.out.println("browser opened");
	}
	@Given("^User on google search page$")
	public void user_on_google_search_page() throws Throwable {
		data=new Properties();
		FileReader reader=new FileReader("src\\test\\java\\testData\\data.properties");  
		data.load(reader); 
	    String URL=data.getProperty("URL");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(URL);
	}

	@When("^enter keyword and search$")
	public void enter_keyword_and_search() throws Throwable {
		String searchbox=data.getProperty("searchbox");
		driver.findElement(By.xpath(searchbox)).sendKeys("Amazon"+Keys.ENTER);
	}

	@Then("^shows information$")
	public void shows_information() throws Throwable {
		String title= driver.getTitle();
		String expectedtitle="Amazon - Google Search";
		System.out.println(title);
		//assert.assertEquals(title, expectedtitle);
		Assert.assertEquals(title, expectedtitle, "title not matching");
		driver.quit();
	}
}
