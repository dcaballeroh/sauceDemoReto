package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProductToCart implements Task {

    public static AddProductToCart backpack() {
        return Tasks.instrumented(AddProductToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.BTN_ADD_BACKPACK),
                Click.on(ProductsPage.LNK_CART)
        );
    }
}
