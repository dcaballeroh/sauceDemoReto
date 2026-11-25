package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target BTN_ADD_BACKPACK = Target.the("botón agregar Sauce Labs Backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target LNK_CART = Target.the("icono del carrito de compras")
            .located(By.className("shopping_cart_link"));
    public static final Target BTN_MENU = Target.the("botón menú lateral")
            .located(By.id("react-burger-menu-btn"));
    public static final Target LNK_LOGOUT = Target.the("opción cerrar sesión")
            .located(By.id("logout_sidebar_link"));

}
