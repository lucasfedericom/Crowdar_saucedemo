package crowdar.web.steps;

import crowdar.web.ui.carrito.CarritoPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoSteps {

    CarritoPage carritoPage;

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

}
