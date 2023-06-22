package steprunner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Features//FbLogin.feature",
		glue="stepdefinition",
		dryRun=false,
		monochrome=true,
		plugin={"pretty","html:target-output.html"}
		)

public class TestRunner {
	

}
