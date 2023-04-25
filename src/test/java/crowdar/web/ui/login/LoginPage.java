package crowdar.web.ui.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:login.page")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//div[@class='login_container']//input[@id='user-name']")
    WebElementFacade inputUser;

    @FindBy(xpath = "//input[@id='password']")
    WebElementFacade inputPassword;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElementFacade btnSubmit;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElementFacade textoProductos;

    @FindBy(css=".error-message-container")
    WebElementFacade errorMessage;

    public WebElementFacade getBtnSubmit(){
        return btnSubmit;
    }

    public WebElementFacade getInputUser() {
        return inputUser;
    }

    public WebElementFacade getInputPassword(){
        return inputPassword;
    }

    public WebElementFacade getTextoProductos(){return textoProductos;}

    public WebElementFacade getErrorMessage(){return errorMessage;}
}
