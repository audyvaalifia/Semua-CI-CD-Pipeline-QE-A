package starter.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.PostNewUser.PostNewUser;

public class PostNewUserSteps {
    @Steps
    PostNewUser PostNewUser;

    @Given("I set POST method endpoints")
    public void setPOSTmethodendpoints(){
        PostNewUser.setPOSTmethodendpoints();
    }
    @When("I navigate to Body menu")
    public void navigatetoBodymenu(){
        PostNewUser.navigatetoBodymenu();
    }
    @And("I enter POST destination URL")
    public void enterPOSTdestinationURL(){
        PostNewUser.enterPOSTdestinationURL();
    }
    @And("I enter new data user in body field")
    public void enternewdatauserinbodyfield(){
        PostNewUser.enternewdatauserinbodyfield();
    }
    @And("I select \"raw\"")
    public void selectraw(){
        PostNewUser.selectraw();
    }
    @And("I select \"JSON\" from the text type dropdown")
    public void selectJSON(){
        PostNewUser.selectJSON();
    }
    @And("I click send POST HTTP request button")
    public void clicksendPOSTHTTPrequestbutton(){
        PostNewUser.clicksendPOSTHTTPrequestbutton();
    }
    @Then("I receive valid HTTP response code 201")
    public void receivevalidHTTPresponsecode201(){
        PostNewUser.receivevalidHTTPresponsecode201();
    }
    @And("I receive the new data that had been added to the system")
    public void receivethenewdatathathadbeenadded(){
        PostNewUser.receivethenewdatathathadbeenadded();
    }
}
