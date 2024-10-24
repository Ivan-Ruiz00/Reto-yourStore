package com.sofka.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static com.sofka.ui.PaginaInicial.CAMERA;
import static com.sofka.ui.PaginaInicial.PHONE;

public class SeleccionarCategoria implements Task {
    String categoria;
    public SeleccionarCategoria(String categoria){
        this.categoria = categoria;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(categoriaPagina(this.categoria)),
                Click.on(categoriaPagina(this.categoria))
        );
    }
    public static SeleccionarCategoria seleccionarCategoria(String categoria){
        return new SeleccionarCategoria(categoria);
    }
    private Target categoriaPagina(String categoria){
        switch (categoria.toLowerCase()){
            case "cameras":
                return CAMERA;
            default:
                return PHONE;
        }
    }
}
