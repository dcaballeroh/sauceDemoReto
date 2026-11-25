package com.co.choucair.stepdefinitions;

import com.co.choucair.utils.KillBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import java.io.IOException;
import java.util.List;

public class Hooks {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void closeDriver() {
        if (SerenityWebdriverManager.inThisTestThread().getCurrentDriver() != null) {
            SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        }
    }
}
