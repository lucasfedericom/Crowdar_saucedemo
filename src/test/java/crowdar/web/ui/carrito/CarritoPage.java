package crowdar.web.ui.carrito;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CarritoPage extends PageObject {

    @FindBy(xpath = "//div[@class='cart_item']")
    List<WebElementFacade> listaDeItems;

    public List<WebElementFacade> getlistaDeItems(){
        return listaDeItems;
    }

}
