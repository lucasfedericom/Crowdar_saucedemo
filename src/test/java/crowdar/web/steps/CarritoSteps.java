package crowdar.web.steps;

import crowdar.web.ui.carrito.CarritoPage;
import crowdar.web.ui.carrito.CheckoutPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoSteps {

    CarritoPage carritoPage;

    CheckoutPage checkoutPage;

    public void verificarExistenciaEnCarrito(String name){
        List<WebElementFacade> listaItems = carritoPage.getlistaDeItems();
        for (WebElementFacade elemento : listaItems) {
            if (elemento.findElement(By.className("inventory_item_name")).getText().equals(name)) {
                assertEquals(name, elemento.findElement(By.className("inventory_item_name")).getText());
                return;
            }
        }
        fail("El elemento " + name + " no se encuentra en el carrito");
    }

    public void confirmarCompra(){
        carritoPage.getButtonCheckout().click();
    }

    public void ingresarDatosDestinatario(String firstName, String lastName, String zipCode){
        checkoutPage.getInputFirstName().sendKeys(firstName);
        checkoutPage.getInputLastName().sendKeys(lastName);
        checkoutPage.getInputZipCode().sendKeys(zipCode);
        checkoutPage.getButtonContinue().click();
        finalizarCompra();
    }

    public void finalizarCompra(){
        checkoutPage.getButtonFinish().click();
    }

    public void verificarCompraRealizada(){
        assertThat("Thank you for your order!").isEqualToIgnoringCase(checkoutPage.getTextOrderComplete());
    }
}
