package wiki.definitions;

import com.google.inject.Inject;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wiki.World;
import wiki.pages.EnMainPage;
import wiki.pages.HomePage;

public class OpenMainPageStepDef {

    public HomePage homePage;
    public EnMainPage enMainPage;

    @Inject
    public OpenMainPageStepDef(World world) {
        this.homePage = world.pageObjectManager.getHomePage();
        this.enMainPage = world.pageObjectManager.getEnMainPage();
    }

    @After
    public void quit() {
        homePage.quit();
    }

    @Given("Home page is opened")
    public void homePageIsOpened() {
        homePage.open()
                .assertCentralFeaturedLogoIsDisplayed();
    }

    @When("User clicks on Main Page Link")
    public void userClicksOnMainPageLink() {
        homePage.clickEnMainPageLink();
    }

    @Then("Welcome block is displayed")
    public void welcomeBlockIsDisplayed() {
        enMainPage.assertWelcomeBlockIsDisplayed();
    }

}
