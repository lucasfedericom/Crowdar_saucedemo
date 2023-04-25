package crowdar.web.stepdefinitions;

import crowdar.web.steps.LoginSteps;
import io.cucumber.java.en.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Dado("que el usuario ingresa a la pagina de login de SauceDemo")
    public void queElUsuarioIngresaAlSitio() {
        loginSteps.abrirPaginaDeLogin();
    }

    @When("intenta iniciar sesion con el usuario {string} y la password {string}")
    public void queElUsuarioIntentaHacerLogin(String usuario, String password) {
        loginSteps.ingresaCredenciales(usuario,password);
    }

    @Then("se visualiza correctamente el sitio de inventario de Saucedemo")
    public void se_visualiza_correctamente_el_sitio_de_inventario_de_saucedemo() {
        assertThat("Products").isEqualToIgnoringCase(loginSteps.getTituloProducts());
    }


    @Then("el sistema informa que el usuario o la password no coinciden con ningun usuario del sistema")
    public void elSistemaInformaCredencialesInvalidas() {
        assertThat("Epic sadface: Username and password do not match any user in this service").isEqualToIgnoringCase(loginSteps.getMensajeError());
    }

    @Then("el sistema informa que el nombre de usuario no fue ingresado")
    public void elSistemaInformaQueElUsernameNoFueIngresado() {
        assertThat("Epic sadface: Username is required").isEqualToIgnoringCase(loginSteps.getMensajeError());

    }

    @Then("el sistema informa que la password no fue ingresada")
    public void elSistemaInformaQueLaPasswordNoFueIngresada() {
        assertThat("Epic sadface: Password is required").isEqualToIgnoringCase(loginSteps.getMensajeError());

    }

    @Then("el sistema informa que faltan ambas credenciales")
    public void elSistemaInformaQueFaltanAmbasCredenciales() {
        assertThat("Epic sadface: Username is required").isEqualToIgnoringCase(loginSteps.getMensajeError());
    }
}
