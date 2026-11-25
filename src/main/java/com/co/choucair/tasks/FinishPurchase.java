package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.CheckoutOverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinishPurchase implements Task {

    public static FinishPurchase now() {
        return Tasks.instrumented(FinishPurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutOverviewPage.BTN_FINISH)
        );
    }
}
