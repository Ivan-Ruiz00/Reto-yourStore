package com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Pago extends PageObject {
    public static final Target BTN_SHIPPING_METHOD=Target.the("Button to end the delivery part of the purchase")
            .located(By.id("button-shipping-method"));
    public static final Target TERMS_AND_COND=Target.the("Checbox to say you have already read and agreed to their terms and conditions")
            .located(By.xpath("//input[@name='agree']"));
    public static final Target BTN_PAYMENT_METHOD=Target.the("Button to finish the process, only remains to confirm")
            .located(By.id("button-payment-method"));
    public static final Target BTN_CONFIRMATION=Target.the("Button to confirm the purchase")
            .located(By.id("button-confirm"));
    public static final Target CONFIRMATION_MSG=Target.the("Confirmation message to finish the purchase process")
            .located(By.xpath("//div[@id='content']/h1"));
}
