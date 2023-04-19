//PUNYA AUDYVA IREFILEVITASARI ALIFIA
package starter.PostNewUser;

import net.thucydides.core.annotations.Step;

public class PostNewUser {

    @Step("I set POST method endpoints")
    public void setPOSTmethodendpoints(){
        System.out.println("I set POST method endpoints");
    }

    @Step("I navigate to Body menu")
    public void navigatetoBodymenu(){
        System.out.println("I navigate to Body menu");
    }

    @Step("I enter POST destination URL")
    public void enterPOSTdestinationURL(){
        System.out.println("I enter POST destination URL");
    }

    @Step("I enter new data user in body field")
    public void enternewdatauserinbodyfield(){
        System.out.println("I enter new data user in body field");
    }

    @Step("I select \"raw\"")
    public void selectraw(){
        System.out.println("I select \"raw\"");
    }

    @Step("I select \"JSON\" from the text type dropdown")
    public void selectJSON(){
        System.out.println("I select \"JSON\" from the text type dropdown");
    }

    @Step("I click send POST HTTP request button")
    public void clicksendPOSTHTTPrequestbutton(){
        System.out.println("I click send POST HTTP request button");
    }

    @Step("I receive valid HTTP response code 201")
    public void receivevalidHTTPresponsecode201(){
        System.out.println("I receive valid HTTP response code 201");
    }

    @Step("I receive the new data that had been added to the system")
    public void receivethenewdatathathadbeenadded(){
        System.out.println("I receive the new data that had been added to the system");
    }
}
