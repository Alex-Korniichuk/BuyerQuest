package com.qamadness.pages;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopBySupplierPage extends PageObject {

    @FindBy(id = "supplierList")
    WebElementFacade suppliersList;

    public ShopBySupplierPage(){
    }

    public void openSupplierPageWithProducts (){
        int suppliersQty = getDriver().findElements(By.xpath("//ul[@id='supplierList']/li")).size();
        for (int i=1; i<=suppliersQty; i++){
            waitForRenderedElementsToBePresent(By.xpath("//ul[@id='supplierList']/li[" + i + "]/div/div/a"));
            getDriver().findElement(By.xpath("//ul[@id='supplierList']/li["+i+"]/div/div/a")).click();
            if(getDriver().findElements(By.xpath("//div[@class='product-item']")).size()>2){
                System.out.print("Category has products");
                break;
            }else{
                getDriver().navigate().back();
            }
        }
    }

    public void addProductsToComparison(){
        for (int i=1; i<=2; i++){
            //waitForRenderedElementsToBePresent(By.xpath("//*[@id='product-listing-container']/div["+i+"]/div/div[2]/div[1]/div/a"));
            WebElement compareLink = getDriver().findElement(By.xpath("//*[@id='product-listing-container']/div["+i+"]/div/div[2]/div[1]/div/a"));
            compareLink.click();
        }
    }

    public void goToComparisonPage (){
        waitForRenderedElementsToBePresent(By.xpath("html/body/div[4]/div/div[3]/a"));
        WebElement linkToComparePage = getDriver().findElement(By.xpath("html/body/div[4]/div/div[3]/a"));
        linkToComparePage.click();
    }

}
