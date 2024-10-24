package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofka.ui.Pago.*;

public class EscribirInfoPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SHIPPING_METHOD),
                Click.on(TERMS_AND_COND),
                Click.on(BTN_PAYMENT_METHOD),
                Click.on(BTN_CONFIRMATION)
        );
    }
    public static EscribirInfoPago escribirInfoPago(){
        return new EscribirInfoPago();
    }
}
