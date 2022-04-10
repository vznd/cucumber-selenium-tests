package wiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnMainPage extends BasePage {

    @FindBy(id = "mp-welcome")
    public WebElement welcomeBlock;

    public EnMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public EnMainPage assertWelcomeBlockIsDisplayed() {
        Assert.assertTrue(welcomeBlock.isDisplayed(), "The welcome block was not displayed!");
        return this;
    }

}
