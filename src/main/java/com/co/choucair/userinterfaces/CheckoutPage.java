package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target TXT_FIRST_NAME = Target.the("campo nombre")
            .located(By.id("first-name"));
    public static final Target TXT_LAST_NAME = Target.the("campo apellido")
            .located(By.id("last-name"));
    public static final Target TXT_POSTAL_CODE = Target.the("campo código postal")
            .located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("botón continuar checkout")
            .located(By.id("continue"));
}
