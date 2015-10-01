package com.qamadness.pages;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompareProductsPage extends PageObject{

    @FindBy(xpath = "//button[@id='bq-ui-1']")
    WebElementFacade addToCartBtn;

    public CompareProductsPage() {
    }

    public void addProductToCart (){
        addToCartBtn.click();
    }

    public void openShoppingCart (){
        waitForRenderedElementsToBePresent(By.xpath("//*[@id='topbar']/ul/li[1]/div/div[4]/div/a"));
        WebDriverWait wait = new WebDriverWait(getDriver(),15);
        WebElement openShoppingCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='topbar']/ul/li[1]/div/div[4]/div/a")));
        openShoppingCartBtn.click();
    }
}
