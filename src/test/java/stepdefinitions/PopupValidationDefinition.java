package stepdefinitions;


import cucumber.api.java.en.*;
import model.PopupValidationData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Validar;
import questions.VerificacionMensaje;
import questions.VerificarPopupValidation;
import task.DiligenciarPopupValidation;
import task.Login;
import task.OpenOut;
import task.Seleccionar;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

public class PopupValidationDefinition {

    @Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void autenticoEnColorlibConUsuarioYClave(String strUsuario, String strClave) {
        OnStage.theActorCalled("Pablo").wasAbleTo(
                OpenOut.thePage(),
                Login.conCredenciales(strUsuario,strClave)
                );
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(Validar.homePage("Bootstrap-Admin-Template"))
        );
    }


    @Given("^Ingreso a la funcionalidad Forms Validation$")
    public void ingresoALaFuncionalidadFormsValidation() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Seleccionar.elMenuSubmenu()
        );
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Valor del Label Titulo Ventana Form Validation", VerificacionMensaje.MensajeHomePopupValidation(),equalTo("Popup Validation"))
        );
    }

    @When("^Diligencio Formulario Popup Validation$")
    public void diligencioFormularioPopupValidation(List<PopupValidationData> Data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarPopupValidation.llenarFormulario(Data));
    }

    @Then("^Verifico ingreso exitoso$")
    public void verificoIngresoExitoso() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Validar Exitencia de Popup", VerificarPopupValidation.existePopup(),equalTo(false))
        );
        /*OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(the(ColorLibFormValidationPage.POPUP_GLOBOINFORMATIVO),isNotVisible())
        );*/
    }
}
