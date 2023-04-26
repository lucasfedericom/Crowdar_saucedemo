package crowdar.web.ui.carrito;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(xpath = "//div[@class='checkout_info']//input[@id='first-name']")
    WebElementFacade inputFirstName;

    @FindBy(xpath = "//div[@class='checkout_info']//input[@id='last-name']")
    WebElementFacade inputLastName;

    @FindBy(xpath = "//div[@class='checkout_info']//input[@id='postal-code']")
    WebElementFacade inputZipCode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElementFacade buttonContinue;

    @FindBy(xpath = "//button[@id='finish']")
    WebElementFacade buttonFinish;

    @FindBy(xpath = "//div[@class='checkout_complete_container']//h2[contains(text(),'Thank you for your order!')]")
    WebElementFacade textOrderComplete;

    public WebElementFacade getInputFirstName(){
        return inputFirstName;
    }

    public WebElementFacade getInputLastName(){
        return inputLastName;
    }

    public WebElementFacade getInputZipCode(){
        return inputZipCode;
    }

    public WebElementFacade getButtonContinue(){
        return buttonContinue;
    }

    public WebElementFacade getButtonFinish(){
        return buttonFinish;
    }

    public String getTextOrderComplete(){
        return textOrderComplete.getText();
    }

}
