package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofka.ui.Checkout.EMAIL;
import static com.sofka.ui.Checkout.PHONE_NUMBER;

public class EscribirInfoContacto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("j.gamboa@1mail.com").into(EMAIL),
                Enter.theValue("3401237654").into(PHONE_NUMBER)
        );
    }
    public static EscribirInfoContacto escribirInfoContacto(){
        return new EscribirInfoContacto();
    }
}
