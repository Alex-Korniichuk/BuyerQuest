package com.qamadness.steps;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */

import com.qamadness.pages.FrontEndLoginPage;
import com.qamadness.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class SuccessfulLoginSteps extends ScenarioSteps {

    FrontEndLoginPage frontEndLoginPage;
    HomePage homePage;

    @Step
    public void open_Page() {
        frontEndLoginPage.open();
    }

    @Step
    public void enter_Credentials(){
        frontEndLoginPage.enterEmail();
        frontEndLoginPage.enterPassword();
    }

    @Step
    public void click_Login_Btn(){
        frontEndLoginPage.clickLoginBtn();
    }

    @Step
    public void check_Is_User_Logged_In(){
        homePage.checkIsUserLoggedIn();
    }

    @Step
    public void click_Main_Menu_Btn(){
        homePage.clickMainMenuBtn();
    }
}
