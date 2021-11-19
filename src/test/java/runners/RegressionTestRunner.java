package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (

        plugin={"html:target/Pcucumber-reports02.html",
                "json:target/json-reports/Pcucumber02.json",
                "junit:target/xml-report/Pcucumber02.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@CH",

        dryRun = false

)
public class RegressionTestRunner {
}
