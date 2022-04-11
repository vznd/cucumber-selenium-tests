package wiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {

    public String URL = "https://www.wikipedia.org/";

    @FindBy(css = "div[lang='en'] a")
    public WebElement enMainPageLink;

    @FindBy(css = "img[class='central-featured-logo']")
    public WebElement centralFeaturedLogo;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public HomePage assertCentralFeaturedLogoIsDisplayed() {
        Assert.assertTrue(centralFeaturedLogo.isDisplayed(), "The central featured logo was not displayed!");
        return this;
    }

    public HomePage clickEnMainPageLink() {
        enMainPageLink.click();
        return this;
    }

}