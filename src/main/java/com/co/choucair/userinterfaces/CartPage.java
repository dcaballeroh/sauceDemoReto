package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target BTN_CHECKOUT = Target.the("botón Checkout")
            .located(By.id("checkout"));
    public static final Target BTN_REMOVE_BACKPACK = Target.the("botón remover producto del carrito")
            .located(By.id("remove-sauce-labs-backpack"));
    public static final Target BTN_CONTINUE_SHOPPING = Target.the("botón continuar comprando")
            .located(By.id("continue-shopping"));
}
