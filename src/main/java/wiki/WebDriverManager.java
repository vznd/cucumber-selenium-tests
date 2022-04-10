package wiki;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

    public String env;
    public ChromeOptions options;
    public WebDriver driver;

    public WebDriverManager() {
        env = getEnv();
        options = getChromeOptions();
        driver = new ChromeDriver(options);
    }

    public ChromeOptions getChromeOptions() {
        if(env.equals("CIRCLE_CI")) {
            return new ChromeOptions()
                    .addArguments("--disable-dev-shm-usage")
                    .addArguments("--headless")
                    .addArguments("--no-sandbox");
        }
        return new ChromeOptions();
    }

    public String getEnv() {
        String env = System.getenv("WIKI_ENV");
        return env == null ? "LOCAL" : env;
    }

    public WebDriver get() {
        return driver;
    }

}
