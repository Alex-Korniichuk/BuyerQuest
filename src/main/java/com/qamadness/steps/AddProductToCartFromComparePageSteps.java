package com.qamadness.steps;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */
import com.qamadness.pages.CompareProductsPage;
import com.qamadness.pages.HomePage;
import com.qamadness.pages.ShopBySupplierPage;
import com.qamadness.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

public class AddProductToCartFromComparePageSteps extends ScenarioSteps {

    CompareProductsPage compareProductsPage;
    ShoppingCartPage shoppingCartPage;

    @Step
    public void add_Product_To_Cart (){
        compareProductsPage.addProductToCart();
    }

    @Step
    public void open_Shopping_Cart(){
        compareProductsPage.openShoppingCart();
    }

    @Step
    public void check_Is_Product_In_The_Cart(){
        Boolean status = shoppingCartPage.checkIsProductInTheCart();
        if (status == true){
            shoppingCartPage.removeProducts();
        }
    }

}
