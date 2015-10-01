package com.qamadness.pages;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://dev.buyerquest.net/p2pdev2/customer/account/login/")
public class FrontEndLoginPage extends PageObject {

    @FindBy (id = "email")
    private WebElementFacade emailField;

    @FindBy (id="pass")
    private WebElementFacade passField;

    @FindBy (id="send2")
    private WebElementFacade loginBtn;

    public FrontEndLoginPage() {
    }

    public void enterEmail (){
        emailField.type("bqtester2015@gmail.com");
    }

    public void enterPassword (){
        passField.type("bquest1");
    }

    public void clickLoginBtn (){
        loginBtn.click();
    }

}
