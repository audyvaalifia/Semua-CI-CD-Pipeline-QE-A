//PUNYA AUDYVA IREFILEVITASARI ALIFIA
package starter.ViewUserById;

import net.thucydides.core.annotations.Step;

public class ViewUserById {

    @Step("I set GET method endpoint")
    public void setGETmethodendpoint() { System.out.println("I set GET method endpoint");
    }

    @Step("I enter GET destination URL with Id in parameter")
    public void enterGETdestinationURLwithIdinparameter() {
        System.out.println("I enter no GET destination URL with Id in parameter");
    }

    @Step("I click Send GET HTTP request button")
    public void clickSendGETHTTPrequestbutton() {
        System.out.println("I click Send GET HTTP request button");
    }

    @Step("I receive GET valid HTTP response code 200 OK")
    public void receiveGETvalidHTTPresponsecode200OK() {
        System.out.println("I receive GET valid HTTP response code 200 OK");
    }

}