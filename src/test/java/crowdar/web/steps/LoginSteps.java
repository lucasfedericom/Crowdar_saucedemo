package crowdar.web.steps;

import crowdar.web.ui.login.LoginPage;


public class LoginSteps {

    LoginPage loginPage;

    public void abrirPaginaDeLogin(){
        loginPage.open();
    }

    public void ingresaCredenciales(String user, String password){
        loginPage.getInputUser().sendKeys(user);
        loginPage.getInputPassword().sendKeys(password);
        loginPage.getBtnSubmit().click();

    }

    public String getTituloProducts(){
        return loginPage.getTextoProductos().getText();
    }

    public String getMensajeError(){
        return loginPage.getErrorMessage().getText();
    }
}
