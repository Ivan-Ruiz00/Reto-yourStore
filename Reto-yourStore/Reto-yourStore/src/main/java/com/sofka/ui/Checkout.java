package com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Checkout extends PageObject {
    public static final Target GUEST_CHECKOUT=Target.the("Guest checkout option")
            .located(By.xpath("//input[@value='guest']"));
    public static final Target BTN_CONTINUE=Target.the("Button to continue with the checkout")
            .located(By.id("button-account"));
    public static final Target FIRST_NAME=Target.the("Name into your personal details form")
            .located(By.id("input-payment-firstname"));
    public static final Target LAST_NAME=Target.the("Last name into your personal details form")
            .located(By.id("input-payment-lastname"));
    public static final Target EMAIL=Target.the("Email into your personal details form")
            .located(By.id("input-payment-email"));
    public static final Target PHONE_NUMBER=Target.the("Phone number into your personal details form")
            .located(By.id("input-payment-telephone"));
    public static final Target ADDRESS=Target.the("Address into your personal details form")
            .located(By.id("input-payment-address-1"));
    public static final Target CITY=Target.the("City into your personal details form")
            .located(By.id("input-payment-city"));
    public static final Target POST_CODE=Target.the("Postal code into your personal details form")
            .located(By.id("input-payment-postcode"));
    public static final Target COUNTRY=Target.the("Country into your personal details form")
            .located(By.id("input-payment-country"));
    public static final Target OPTN_COUNTRY=Target.the("Option selected on the list of countries")
            .located(By.xpath("//option[@value=62]"));
    public static final Target REGION_STATE=Target.the("Region or state in the country previously selected")
            .located(By.id("input-payment-zone"));
    public static final Target OPTN_REGION_STATE=Target.the("Option selected on the list of regions or states")
            .located(By.xpath("//option[@value=986]"));
    public static final Target BTN_GUEST=Target.the("The button that allow us to continue after filling the information form")
            .located(By.id("button-guest"));
}
