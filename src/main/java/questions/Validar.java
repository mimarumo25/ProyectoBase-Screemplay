package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ColorLibFormValidationPage;

public class Validar implements Question<Boolean> {
    private String strLabelHomePage;

    public Validar(String strLabelHomePage) {
        this.strLabelHomePage = strLabelHomePage;
    }

    public static Validar homePage(String strLabelHomePage) {
        return new Validar(strLabelHomePage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ColorLibFormValidationPage.HOME_LOGO.resolveFor(actor).isDisplayed();
    }
}
