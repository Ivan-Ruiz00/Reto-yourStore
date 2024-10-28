package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.ui.Pago.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EscribirInfoPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SHIPPING_METHOD,isClickable()),
                Click.on(BTN_SHIPPING_METHOD),
                WaitUntil.the(TERMS_AND_COND,isClickable()),
                Click.on(TERMS_AND_COND),
                Click.on(BTN_PAYMENT_METHOD),
                WaitUntil.the(BTN_CONFIRMATION,isClickable()),
                Click.on(BTN_CONFIRMATION)
        );
    }
    public static EscribirInfoPago escribirInfoPago(){
        return new EscribirInfoPago();
    }
}
