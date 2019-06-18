package com.cbt.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author selimssevgi
 */
public class HelloWorldStepDef {
  @Given("this is our first cucumber test")
  public void thisIsOurFirstCucumberTest() {
    System.out.println("First cucumber test");
  }

  @When("running the test")
  public void runningTheTest() {
    System.out.println("Running");
  }

  @Then("I should be greeted with hello-world")
  public void iShouldBeGreetedWithHelloWorld() {
    System.out.println("hello-world");
  }
}
