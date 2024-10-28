package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.ui.CategoriaPhones.PHONE_SELECTED;
import static com.sofka.ui.Producto.ADD_TO_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AnnadirProducto implements Task {
    String producto;
    public AnnadirProducto(String producto){
        this.producto=producto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PHONE_SELECTED(producto),isClickable()),
                Click.on(PHONE_SELECTED(producto)),
                WaitUntil.the(ADD_TO_CART,isClickable()),
                Scroll.to(ADD_TO_CART),
                Click.on(ADD_TO_CART)
        );
    }
    public static AnnadirProducto annadirProducto(String producto){
        return new AnnadirProducto(producto);
    }
}
