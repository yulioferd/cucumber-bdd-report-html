package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue={"runner"},
        monochrome = true,
        plugin = {"pretty","html:target/HtmlReports",
        "json:target/cucumber.json",
        "html:target/JUnitReports/report.xml"})
public class TestRunner {
}
