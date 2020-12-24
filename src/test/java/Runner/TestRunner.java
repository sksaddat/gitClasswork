package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature" ,glue="stepDefinition", monochrome=true,
tags= "@smokeTest",
dryRun=false)

public class TestRunner {
	


}
