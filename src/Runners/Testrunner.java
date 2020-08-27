package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
	features = "../FirstTest/src/Features/",
	glue = {"StepDefs"}  )
	

public class Testrunner {

}
