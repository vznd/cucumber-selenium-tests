package wiki.managers;

import org.openqa.selenium.WebDriver;
import wiki.pages.EnMainPage;
import wiki.pages.HomePage;

public class PageObjectManager {

    private final WebDriver driver;

    private HomePage homePage;
    private EnMainPage enMainPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public EnMainPage getEnMainPage() {
        if (enMainPage == null) {
            enMainPage = new EnMainPage(driver);
        }
        return enMainPage;
    }

}
