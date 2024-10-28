package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofka.ui.Checkout.BTN_CONTINUE;
import static com.sofka.ui.Checkout.GUEST_CHECKOUT;

public class GuestCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GUEST_CHECKOUT),
                Click.on(BTN_CONTINUE)
        );
    }
    public static GuestCheckout guestCheckout(){
        return new GuestCheckout();
    }
}
