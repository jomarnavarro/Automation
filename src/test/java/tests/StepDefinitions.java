package tests;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

	public WebDriver driver;
	public WebDriverWait wait;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("I navigate to sinatra site")
	public void navigateToSite() {


	}

	@And("The sinatra site loads correctly")
	public void sinatraSiteLoadsCorrectly () {

	}

	@When("I navigate to song list")
	public void navigateToSongList () {

	}
	
	@And ("I navigate to the first song")  
	public void iNavigateToTheFirstSong () {

	}

	@And ("I like that song")
	public void iLikeThatSong () {

	}

	@Then("The song has one more like")
	public void TheSongHasOneMoreLike () {

	}

}
