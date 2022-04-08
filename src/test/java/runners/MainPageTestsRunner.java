package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/OpenMainPage.feature", glue = "definitions")
public class MainPageTestsRunner extends AbstractTestNGCucumberTests {
}
