package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenMainPageDefinitions {

    WebDriver driver;

    @Before
    public void startDriver() {
        driver = new ChromeDriver();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Given("Home page is opened")
    public void homePageIsOpened() {
        driver.get("https://www.wikipedia.org/");
        Assert.assertTrue(driver.findElement(By.cssSelector("img[class='central-featured-logo']")).isDisplayed(),
                "The central featured logo was not displayed!");
    }

    @When("User clicks on Main Page Link")
    public void userClicksOnMainPageLink() {
        driver.findElement(By.cssSelector("div[lang='en'] a")).click();
    }

    @Then("Welcome block is displayed")
    public void welcomeBlockIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.id("mp-welcome")).isDisplayed(),
                "The welcome block was not displayed!");
    }
}
