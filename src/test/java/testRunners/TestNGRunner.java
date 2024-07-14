package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}

