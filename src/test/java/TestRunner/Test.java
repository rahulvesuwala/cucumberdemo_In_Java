package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Test.feature",
        glue="StepDefinition",
        dryRun = true,
        monochrome = true,
        plugin = {"new","html:test_output"}
)

public class Test {
}
