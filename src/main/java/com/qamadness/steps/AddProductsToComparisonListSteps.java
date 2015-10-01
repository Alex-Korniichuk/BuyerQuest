package com.qamadness.steps;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */
import com.qamadness.pages.HomePage;
import com.qamadness.pages.ShopBySupplierPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddProductsToComparisonListSteps extends ScenarioSteps {

    HomePage homePage;
    ShopBySupplierPage shopBySupplierPage;

    @Step
    public void click_Main_Menu_Btn(){
        homePage.clickMainMenuBtn();
    }

    @Step
    public void click_Shop_By_Supplier_Link(){
        homePage.clickShopBySupplierLink();
    }

    @Step
    public void open_Supplier_Page_With_Products(){
        shopBySupplierPage.openSupplierPageWithProducts();
    }

    @Step
    public void add_Products_To_Comparison(){
        shopBySupplierPage.addProductsToComparison();
    }

    @Step
    public void go_To_Comparison_Page(){
        shopBySupplierPage.goToComparisonPage();
    }
}
