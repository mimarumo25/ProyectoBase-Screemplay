package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.ColorLibFormValidationPage.HOME_LOGO_FORM_VALIDATION;

public class VerificacionMensaje implements Question<Boolean> {
    public static Question<Boolean> MensajeHomePopupValidation(){
        return new VerificacionMensaje();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOME_LOGO_FORM_VALIDATION.resolveFor(actor).isDisplayed();
    }
}
