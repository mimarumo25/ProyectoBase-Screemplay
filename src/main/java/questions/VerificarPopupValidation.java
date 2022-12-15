package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.EventualConsequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ColorLibFormValidationPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static userinterface.ColorLibFormValidationPage.POPUP_GLOBOINFORMATIVO;

public class VerificarPopupValidation implements Question<Boolean> {
    public static VerificarPopupValidation existePopup() {
        return new VerificarPopupValidation();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return POPUP_GLOBOINFORMATIVO.resolveFor(actor).isDisplayed();
    }
}
