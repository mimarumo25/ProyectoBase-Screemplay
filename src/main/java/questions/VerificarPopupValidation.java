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

public class VerificarPopupValidation implements Question<Boolean> {
    public static VerificarPopupValidation existePopup() {
        return new VerificarPopupValidation();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try{
            /*OnStage.theActorInTheSpotlight().should(
                    EventualConsequence.eventually(
                            GivenWhenThen.seeThat(
                                    WebElementQuestion.the(ColorLibFormValidationPage.POPUP_GLOBOINFORMATIVO),
                                    WebElementStateMatchers.isNotVisible()
                            )
                    ).waitingForNoLongerThan(3).seconds()
            );*/
            OnStage.theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(ColorLibFormValidationPage.POPUP_GLOBOINFORMATIVO, isNotVisible()).
                            forNoMoreThan(3).seconds()
            );
            return false;
        }catch (Exception e){
            return true;
        }
    }
}
