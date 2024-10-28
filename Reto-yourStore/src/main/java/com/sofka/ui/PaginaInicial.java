package com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static final Target PHONE=Target.the("Phones category")
            .located(By.xpath("(//ul[@class='nav navbar-nav']/li/a[contains(text(),'Phones')])"));
    public static final Target CAMERA=Target.the("Cameras category")
            .located(By.xpath("(//li/a[text()='Cameras'])"));
    public static final Target CART=Target.the("Shopping cart")
            .located(By.id("cart"));
}
