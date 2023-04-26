package crowdar.web.stepdefinitions;

import crowdar.web.steps.CarritoSteps;
import crowdar.web.steps.InventarioSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class CarritoStepDefinitions {

    String nombreItem;

    @Steps
    CarritoSteps carritoSteps;

    @Steps
    InventarioSteps inventarioSteps;

    @When("agrega un item del inventario al carrito de compras")
    public void queElUsuarioAgregaUnItemAlCarrito() {
        nombreItem = inventarioSteps.agregarProductoAlCarrito(1);
    }

    @Then("se visualiza correctamente el producto en el carrito")
    public void seVisualizaCorrectamenteElProductoEnElCarrito() {
        inventarioSteps.ingresarACarrito();
        carritoSteps.verificarExistenciaEnCarrito(nombreItem);
    }

    @And("se confirma la compra de los productos seleccionados ingresando los datos del destinatario")
    public void seConfirmaLaCompraDeLosProductosSeleccionadosIngresandoLosDatosDelDestinatario() {
        carritoSteps.confirmarCompra();
        carritoSteps.ingresarDatosDestinatario("Federico","Martinez","4700");
    }

    @Then("el sistema informa la confirmación de la compra")
    public void elSistemaInformaLaConfirmaciónDeLaCompra() {
        carritoSteps.verificarCompraRealizada();
    }
}
