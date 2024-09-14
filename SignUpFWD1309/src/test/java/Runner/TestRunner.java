package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature", glue = "MyStepDefination",
plugin = {"pretty","html:Target/cucumber-report.html","json:Target/cucumber-report.json"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
