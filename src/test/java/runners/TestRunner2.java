package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/FunctionalTests"},
                 glue= {"stepDefinition"},
                // plugin= {"html:target/cucumber-html-report", "json:target/cucumber/wikipedia.json", "pretty"},
                 plugin= {"html:target/cucumber/DemoTours.html", "json:target/cucumber/DemoToursJson.json", "pretty"},
                 tags = {"~@UserRegister"})

public class TestRunner2 {

}
