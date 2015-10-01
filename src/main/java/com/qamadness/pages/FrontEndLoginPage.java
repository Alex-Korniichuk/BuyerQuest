package com.qamadness.pages;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("")
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
        emailField.type("");
    }

    public void enterPassword (){
        passField.type("");
    }

    public void clickLoginBtn (){
        loginBtn.click();
    }

}
