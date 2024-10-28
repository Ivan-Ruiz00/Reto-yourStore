package com.sofka.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoriaPhones extends PageObject {
    public static Target PHONE_SELECTED(String producto) {
        String PHONE_SELECTED="//a[contains(text(),'%s')]";
        return Target.the("Phone the user selected")
                .located(By.xpath(String.format(PHONE_SELECTED,producto)));
    }
}
