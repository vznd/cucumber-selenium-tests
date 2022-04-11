package wiki;

import io.cucumber.guice.ScenarioScoped;
import wiki.managers.WebDriverManager;

@ScenarioScoped
public class World {

    public WebDriverManager webDriverManager;

    public World() {
        webDriverManager = new WebDriverManager();
    }

}
