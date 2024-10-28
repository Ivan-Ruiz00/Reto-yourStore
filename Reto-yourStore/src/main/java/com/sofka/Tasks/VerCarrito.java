package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofka.ui.Carrito.VIEW_CART;

public class VerCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(VIEW_CART)
        );
    }
    public static VerCarrito verCarrito(){
        return new VerCarrito();
    }
}
