import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"steps"}
        ,monochrome = true,
        plugin = {"pretty", "junit:target/JunitReports/report.xml","json:target/JunitReports/reportXML.xml","html:target/JunitReports/reporHTML.html"},
        tags="@Test"
        )
public class TestRunner {

}