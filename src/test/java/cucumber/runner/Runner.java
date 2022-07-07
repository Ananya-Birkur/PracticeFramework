package cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="Features", glue= {"cucumber.stepdefination"}, plugin= {"pretty",
		"html:target/cucumber-htmlreport",}
)
@RunWith(Cucumber.class)

public class Runner {

}
