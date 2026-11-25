package com.co.choucair.stepdefinitions;

import com.co.choucair.models.CheckoutLombokData;
import com.co.choucair.questions.PurchaseConfirmation;
import com.co.choucair.questions.ValidateBtnLogin;
import com.co.choucair.tasks.AddProductToCart;
import com.co.choucair.tasks.FillCheckoutInformation;
import com.co.choucair.tasks.FinishPurchase;
import com.co.choucair.tasks.RemoveProductAndLogout;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PurchaseStepDefinitions {
    @And("adds a product to the cart and completes checkout")
    public void completePurchaseFlow(DataTable dataTable) {
        CheckoutLombokData data = CheckoutLombokData.setData(dataTable).get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductToCart.backpack(),
                FillCheckoutInformation.withData(data),
                FinishPurchase.now()
        );
    }

    @Then("the order confirmation message should be {string}")
    public void verifyOrderConfirmation(String expectedMessage) {
        theActorInTheSpotlight().should(
                seeThat(PurchaseConfirmation.message(), equalTo(expectedMessage))
        );
    }

    @And("adds a product to the cart, removes it and logs out")
    public void removeProductAndLogoutFlow() {
        theActorInTheSpotlight().attemptsTo(
                AddProductToCart.backpack(),
                RemoveProductAndLogout.fromCart()
        );
    }

    @Then("the user should return to the login screen")
    public void verifyReturnToLogin() {
        theActorInTheSpotlight().should(
                seeThat(ValidateBtnLogin.onScreen(), is(true))
        );
    }
}
