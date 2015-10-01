package com.qamadness.jbehave;

import com.qamadness.steps.AddProductToCartFromComparePageSteps;
import com.qamadness.steps.AddProductsToComparisonListSteps;
import com.qamadness.steps.SuccessfulLoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by alexandrakorniichuk on 30.09.15.
 */
public class AddToCartFromComparePageSteps {

    @Steps
    SuccessfulLoginSteps successfulLoginSteps;
    @Steps
    AddProductsToComparisonListSteps addProductsToComparisonListSteps;
    @Steps
    AddProductToCartFromComparePageSteps addProductToCartFromComparePageSteps;

    @Given("logged in user adds three products to comparison list")
    public void givenLoggedInUserAddsThreeProductsToComparisonList() {
        successfulLoginSteps.open_Page();
        successfulLoginSteps.enter_Credentials();
        successfulLoginSteps.click_Login_Btn();
        successfulLoginSteps.check_Is_User_Logged_In();
        addProductsToComparisonListSteps.click_Main_Menu_Btn();
        addProductsToComparisonListSteps.click_Shop_By_Supplier_Link();
        addProductsToComparisonListSteps.open_Supplier_Page_With_Products();
        addProductsToComparisonListSteps.add_Products_To_Comparison();
        addProductsToComparisonListSteps.go_To_Comparison_Page();
    }

    @When("the user adds a product to the cart from Compare Products page")
    public void whenTheUserAddsAProductToTheCartFromComparePage() {
        addProductToCartFromComparePageSteps.add_Product_To_Cart();
        addProductToCartFromComparePageSteps.open_Shopping_Cart();
    }

    @Then("product is added to the cart from Compare Products page")
    public void thenProductIsAddedToTheCart() {
        addProductToCartFromComparePageSteps.check_Is_Product_In_The_Cart();
        //removing products from comparison list
        addProductsToComparisonListSteps.click_Main_Menu_Btn();
        addProductsToComparisonListSteps.click_Shop_By_Supplier_Link();
        addProductsToComparisonListSteps.open_Supplier_Page_With_Products();
        addProductsToComparisonListSteps.add_Products_To_Comparison();
    }

}
