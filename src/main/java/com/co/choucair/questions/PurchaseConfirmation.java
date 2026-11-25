package com.co.choucair.questions;

import com.co.choucair.userinterfaces.CheckoutCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseConfirmation implements Question<String> {
    public static PurchaseConfirmation message() {
        return new PurchaseConfirmation();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckoutCompletePage.LBL_ORDER_COMPLETE).answeredBy(actor);
    }

}
