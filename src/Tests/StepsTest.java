package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsTest {
	
	@Given("^Step(\\d+)$")
	public void step1() throws Throwable {
		
		System.out.println("Step1 passed");
	}

	@When("^Step(\\d+)$")
	public void step2() throws Throwable {
		
		System.out.println("Step2 passed");
	}
	

	@Then("^Step(\\d+)$")
	public void step3() throws Throwable {
		
		System.out.println("Step3 passed");
	}
	}



