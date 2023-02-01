package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.VerificarSesion;
import tasks.AbrirNavegador;
import tasks.DigitarDatos;

public class LoginStepDefintion {

    @Before
    public void iniciarTest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que miguel abre la app saucedemo$")
    public void que_miguel_abre_la_app_saucedemo() {
        OnStage.theActorCalled("Miguel").attemptsTo(AbrirNavegador.abrir());
    }

    @When("^miguel ingresa usario, password y da clien en el boton login$")
    public void miguel_ingresa_usario_password_y_da_clien_en_el_boton_login() {
        OnStage.theActorInTheSpotlight().attemptsTo(DigitarDatos.llenar());
    }

    @Then("^miguel podra ver en pantalla la palabra dasboard$")
    public void miguel_podra_ver_en_pantalla_la_palabra_dasboard() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarSesion.valida()));
    }
}
