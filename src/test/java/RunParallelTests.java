import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import courgette.api.CucumberOptions;
import org.junit.runner.RunWith;

//CourgetteRunLevel.SCENARIO
//CourgetteRunLevel.FEATURE

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 10,
        runLevel = CourgetteRunLevel.FEATURE,
        showTestOutput = true,
        reportTargetDir = "build/parallel",
        cucumberOptions = @CucumberOptions(
                features = "src/test/java/Features",
                glue = {"StepDefinitions"},
                tags = "@Smoke",
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html",
                        "junit:build/cucumber-report/cucumber.xml",
                        "html:target/cucumber-report.html"}
        )
)
public class RunParallelTests {
}
