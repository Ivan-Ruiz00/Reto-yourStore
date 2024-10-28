package com.sofka.stepDefinitions;

import com.sofka.Tasks.AbrirPaginaInicial;
import com.sofka.setup.Configuracion;
import com.sun.istack.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static com.sofka.Tasks.AbrirCarrito.abrirCarrito;
import static com.sofka.Tasks.AnnadirProducto.annadirProducto;
import static com.sofka.Tasks.ClickCheckout.clickCheckout;
import static com.sofka.Tasks.EscribirDireccion.escribirDireccion;
import static com.sofka.Tasks.EscribirInfoContacto.escribirInfoContacto;
import static com.sofka.Tasks.EscribirInfoPago.escribirInfoPago;
import static com.sofka.Tasks.EscribirNombre.escribirNombre;
import static com.sofka.Tasks.GuestCheckout.guestCheckout;
import static com.sofka.Tasks.SeleccionarCategoria.seleccionarCategoria;
import static com.sofka.Tasks.VerCarrito.verCarrito;
import static com.sofka.questions.MensajeConfirmacion.mensajeConfirmacion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class compraStepDefinition extends Configuracion {
    String categoria;
    public static Logger LOGGER= Logger.getLogger(compraStepDefinition.class);
    @Given("that the user is at the main page")
    public void thatTheUserIsAtTheMainPage() {
        try{
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(new AbrirPaginaInicial());
        }catch (Exception e){
            LOGGER.info("Configuration failed");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("the user selects a {string}")
    public void theUserSelectsA(String categoria) {
        this.categoria=categoria;
        try{
            theActorInTheSpotlight().attemptsTo(
                    seleccionarCategoria(categoria)
            );
        }catch (Exception e){
            LOGGER.info("Category slection failed");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("chooses {string} and {string}")
    public void choosesAnd(String productoUno, String productoDos) {
        try{
            theActorInTheSpotlight().attemptsTo(
                    annadirProducto(productoUno),
                    seleccionarCategoria(this.categoria),
                    annadirProducto(productoDos)
            );
        }catch (Exception e){
            LOGGER.info("Products selection failed");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("completes the checkout as a guest")
    public void completesTheCheckoutAsAGuest() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    abrirCarrito(),
                    verCarrito(),
                    clickCheckout(),
                    guestCheckout(),
                    escribirNombre(),
                    escribirInfoContacto(),
                    escribirDireccion(),
                    escribirInfoPago()
            );
        }catch (Exception e){
            LOGGER.info("Checkout failed");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Then("the user should watch a confirmation message on the screen")
    public void theUserShouldWatchAConfirmationMessageOnTheScreen() {
        try{
            theActorInTheSpotlight().should(
                    seeThat(mensajeConfirmacion(),equalTo("Your order has been placed!"))
            );
        }catch (Exception e){
            LOGGER.info("Confirmation failed");
            LOGGER.warning(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
}
