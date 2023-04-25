package crowdar.web.steps;

import crowdar.web.ui.carrito.InventarioPage;
import net.serenitybdd.core.pages.WebElementFacade;

public class InventarioSteps {

    InventarioPage inventarioPage;

    public String agregarProductoAlCarrito(Integer i){
       WebElementFacade item = inventarioPage.getItem(1);
       String nombreItem = item.findBy(".//div[@class='inventory_item_name']").getText();
       item.findBy(".//button").click();
       return nombreItem;
    }

    public void ingresarACarrito(){
        inventarioPage.getIconoCarrito().click();
    }


}
