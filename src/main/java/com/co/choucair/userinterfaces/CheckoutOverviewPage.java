package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {
    public static final Target BTN_FINISH = Target.the("botón finalizar compra")
            .located(By.id("finish"));
    public static final Target LBL_ITEM_NAME = Target.the("nombre del producto en resumen")
            .located(By.className("inventory_item_name"));
}
