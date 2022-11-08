package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ColorLibFormValidationPage;

public class VerificacionMensaje {
    public static Question<String> MensajeHomePopupValidation(){
        return actor -> Text.of(ColorLibFormValidationPage.HOME_LOGO_FORM_VALIDATION).viewedBy(actor).asString();
    }
}
