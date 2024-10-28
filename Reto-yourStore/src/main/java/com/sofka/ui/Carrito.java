package com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Carrito extends PageObject {
    public static final Target VIEW_CART=Target.the("View the cart")
            .located(By.xpath("//strong[contains(text(),'View Cart')]"));
    public static final Target CHECKOUT=Target.the("Checkout to finish the purchase process")
            .located(By.xpath("//a[@class='btn btn-primary']"));
}
