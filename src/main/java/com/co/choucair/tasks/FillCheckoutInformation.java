package com.co.choucair.tasks;

import com.co.choucair.models.CheckoutLombokData;
import com.co.choucair.userinterfaces.CartPage;
import com.co.choucair.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillCheckoutInformation implements Task {
    private final CheckoutLombokData checkoutData;

    public FillCheckoutInformation(CheckoutLombokData checkoutData) {
        this.checkoutData = checkoutData;
    }

    public static FillCheckoutInformation withData(CheckoutLombokData checkoutData) {
        return Tasks.instrumented(FillCheckoutInformation.class, checkoutData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.BTN_CHECKOUT),
                Enter.theValue(checkoutData.getFirstName()).into(CheckoutPage.TXT_FIRST_NAME),
                Enter.theValue(checkoutData.getLastName()).into(CheckoutPage.TXT_LAST_NAME),
                Enter.theValue(checkoutData.getPostalCode()).into(CheckoutPage.TXT_POSTAL_CODE),
                Click.on(CheckoutPage.BTN_CONTINUE)
        );
    }
}
