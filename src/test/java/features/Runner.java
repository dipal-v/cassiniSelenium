package features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  publish = false,
        features = {"src\\test\\resources\\features"},
        glue = {"features"},
        plugin = { "html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml"},
        monochrome = true,
        stepNotifications = true
)

public class Runner {

}

