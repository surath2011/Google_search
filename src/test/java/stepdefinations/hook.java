package stepdefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hook {
	WebDriver driver;
	@Before("@search")
	public void beforesearch() {
		System.out.println("this is beforesearch");
	}
	@After("@search")
	public void aftersearch() {
		System.out.println("this is aftersearch");
		
	}
}
