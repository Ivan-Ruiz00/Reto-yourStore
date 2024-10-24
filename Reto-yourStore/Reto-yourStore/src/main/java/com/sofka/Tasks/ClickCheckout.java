package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.sofka.ui.Carrito.CHECKOUT;

public class ClickCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CHECKOUT),
                Click.on(CHECKOUT)
        );
    }
    public static ClickCheckout clickCheckout(){
        return new ClickCheckout();
    }
}
