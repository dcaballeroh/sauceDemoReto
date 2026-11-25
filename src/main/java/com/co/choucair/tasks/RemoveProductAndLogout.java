package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CartPage;
import com.co.choucair.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RemoveProductAndLogout implements Task {
    public static RemoveProductAndLogout fromCart() {
        return Tasks.instrumented(RemoveProductAndLogout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.BTN_REMOVE_BACKPACK),
                Click.on(ProductsPage.BTN_MENU),
                Click.on(ProductsPage.LNK_LOGOUT)
        );
    }
}
