package io.mekmanager.example;

import cucumber.api.java.en.*;
import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private Adder adder;

    @Given("a variable set to {int}")
    public void given_a_variable_set_to_int(int arg) {
        this.adder = new Adder(arg);
    }

    @When("I increment the variable by {int}")
    public void when_i_increment_the_variable_by_int(int arg) {
        this.adder.increment(arg);
    }

    @Then("the variable should contain {int}")
    public void the_variable_should_contain_int(int arg) {
        assertEquals(this.adder.getValue(), arg);
    }
}
