package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofka.ui.Checkout.*;

public class EscribirDireccion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Casa 10").into(ADDRESS),
                Enter.theValue("Milan").into(CITY),
                Enter.theValue("12784").into(POST_CODE),
                Click.on(COUNTRY),
                Click.on(OPTN_COUNTRY),
                Click.on(REGION_STATE),
                Click.on(OPTN_REGION_STATE),
                Click.on(BTN_GUEST)
        );
    }
    public static EscribirDireccion escribirDireccion(){
        return new EscribirDireccion();
    }
}
