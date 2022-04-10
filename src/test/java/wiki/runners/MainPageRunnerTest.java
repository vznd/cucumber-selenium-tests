package wiki.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/", glue = "wiki/definitions")
public class MainPageRunnerTest extends AbstractTestNGCucumberTests {
}
