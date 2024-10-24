package com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofka.ui.Pago.CONFIRMATION_MSG;

public class MensajeConfirmacion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CONFIRMATION_MSG.resolveFor(actor).getText();
    }
    public static MensajeConfirmacion mensajeConfirmacion(){
        return new MensajeConfirmacion();
    }
}
