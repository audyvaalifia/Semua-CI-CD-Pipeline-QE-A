package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ViewUserById.ViewUserById;

public class ViewUserByIdSteps {
    @Steps
    ViewUserById ViewUserById;

    @Given("I set GET method endpoint")
    public void setGETmethodendpoint(){
        ViewUserById.setGETmethodendpoint();
    }
    @When("I enter GET destination URL with Id in parameter")
    public void enterGETdestinationURLwithIdinparameter(){
        ViewUserById.enterGETdestinationURLwithIdinparameter();
    }
    @And("I click Send GET HTTP request button")
    public void clickSendGETHTTPrequestbutton(){
        ViewUserById.clickSendGETHTTPrequestbutton();
    }
    @Then("I receive GET valid HTTP response code 200 OK")
    public void receiveGETvalidHTTPresponsecode200OK(){
        ViewUserById.receiveGETvalidHTTPresponsecode200OK();
    }
}
