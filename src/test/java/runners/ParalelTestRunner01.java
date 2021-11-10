package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        plugin={"html:target\\Pcucumber-reports01.html",
                "json:target/json-reports/Pcucumber01.json",
                "junit:target/xml-report/Pcucumber01.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Paralel01",

        dryRun = false



)

public class ParalelTestRunner01 {


}
