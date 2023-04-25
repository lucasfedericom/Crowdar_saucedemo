package crowdar.web.ui.carrito;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

public class InventarioPage extends PageObject {

    @FindBy(xpath = "//div[@class='inventory_item']")
    List<WebElementFacade> listaDeElementos;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    WebElementFacade iconoCarrito;

    public WebElementFacade getItem(Integer i){
        return listaDeElementos.get(i-1);
    }

    public WebElementFacade getIconoCarrito(){
        return iconoCarrito;
    }

}
