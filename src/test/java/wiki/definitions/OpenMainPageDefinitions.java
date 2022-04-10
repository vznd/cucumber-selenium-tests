package wiki.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import wiki.WebDriverManager;
import wiki.pages.EnMainPage;
import wiki.pages.HomePage;

public class OpenMainPageDefinitions {

    public WebDriver driver;
    public HomePage homePage;
    public EnMainPage enMainPage;

    @Before
    public void startDriver() {
        driver = new WebDriverManager().get();
        homePage = new HomePage(driver);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Given("Home page is opened")
    public void homePageIsOpened() {
        homePage.open().assertCentralFeaturedLogoIsDisplayed();
    }

    @When("User clicks on Main Page Link")
    public void userClicksOnMainPageLink() {
        homePage.clickEnMainPageLink();
        enMainPage = new EnMainPage(driver);
    }

    @Then("Welcome block is displayed")
    public void welcomeBlockIsDisplayed() {
        enMainPage.assertWelcomeBlockIsDisplayed();
    }

}
