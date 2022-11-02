package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    @Given("user calculate {int}\\/{int}")
    public void user_calculate(Integer int1, Integer int2) {
        int i = 1/0;
        System.out.println(i);
    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("test");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("test");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("test");
    }

    @Then("error message is dispalyed - Invalid credentials")
    public void error_message_is_dispalyed_invalid_credentials() {
        System.out.println("test");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("test");
    }
}
