package com.co.choucair.questions;

import com.co.choucair.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateBtnLogin implements Question<Boolean> {
    public static ValidateBtnLogin onScreen() {
        return new ValidateBtnLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LoginPage.BTN_SUBMIT).answeredBy(actor);
    }
}
