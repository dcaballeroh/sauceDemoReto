package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompletePage {
    public static final Target LBL_ORDER_COMPLETE = Target.the("mensaje de confirmación de compra")
            .located(By.className("complete-header"));
    public static final Target BTN_BACK_HOME = Target.the("botón regresar al inicio")
            .located(By.id("back-to-products"));
}