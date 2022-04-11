package wiki;

import io.cucumber.guice.ScenarioScoped;
import wiki.managers.PageObjectManager;
import wiki.managers.WebDriverManager;

@ScenarioScoped
public class World {

    public WebDriverManager webDriverManager;
    public PageObjectManager pageObjectManager;

    public World() {
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

}
