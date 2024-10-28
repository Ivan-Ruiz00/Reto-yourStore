package com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Producto extends PageObject {
    public static Target ADD_TO_CART=Target.the("Button to add products to cart")
            .located(By.id("button-cart"));
}
