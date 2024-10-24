package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofka.ui.Checkout.FIRST_NAME;
import static com.sofka.ui.Checkout.LAST_NAME;

public class EscribirNombre implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Juan").into(FIRST_NAME),
                Enter.theValue("Gamboa").into(LAST_NAME)
        );
    }
    public static EscribirNombre escribirNombre(){
        return new EscribirNombre();
    }
}
