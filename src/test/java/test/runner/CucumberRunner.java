package test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/test/feature/"},
        glue = {"selenium/steps/"},
        plugin = {"pretty",
        "selenium.reporter.AllureReport"},
        tags = "@success"

)
public class CucumberRunner {
}
