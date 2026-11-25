package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
  public static final Target TXT_USER = Target.the("campo de usuario")
          .located(By.id("user-name"));
  public static final Target TXT_PASS = Target.the("campo de contraseña")
          .located(By.id("password"));
  public static final Target BTN_SUBMIT = Target.the("botón iniciar sesión")
          .located(By.id("login-button"));
  public static final Target TXT_VALIDATION = Target.the("logo principal Swag Labs")
          .located(By.className("app_logo"));
}