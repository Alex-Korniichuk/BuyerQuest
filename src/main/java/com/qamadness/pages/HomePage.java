package com.qamadness.pages;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    @FindBy(xpath="//*[@class='log-out-link']")
    WebElementFacade logoutLink;

    @FindBy (xpath = "//button[@class='lines-button sb-toggle-left']")
    WebElementFacade mainMenuBtn;

    @FindBy (xpath = "//ul[@id='nav-collapse-top-0']/li[7]/a")
    WebElementFacade shopBySupplierLink;

    public HomePage() {
    }

    public void checkIsUserLoggedIn (){
        if ((logoutLink.isPresent())==true) {
            System.out.println("User is logged in");
        }
        else {
            System.out.print("User isn't logged in");
            System.exit(0);
        }
    }

    public void clickMainMenuBtn(){
        mainMenuBtn.waitUntilClickable().click();
    }

    public void clickShopBySupplierLink (){
        shopBySupplierLink.click();
    }
}
