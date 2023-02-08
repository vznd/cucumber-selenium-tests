package wiki.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

    private final ChromeOptions options;
    private final WebDriver driver;

    public WebDriverManager() {
        options = getChromeOptions();
        driver = new ChromeDriver(options);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public ChromeOptions getOptions() {
        return options;
    }

    private ChromeOptions getChromeOptions() {
        if(EnvironmentManager.getEnv().equals("GITHUB")) {
            return new ChromeOptions()
                    .addArguments("--disable-dev-shm-usage")
                    .addArguments("--headless")
                    .addArguments("--no-sandbox");
        }
        return new ChromeOptions();
    }

}
