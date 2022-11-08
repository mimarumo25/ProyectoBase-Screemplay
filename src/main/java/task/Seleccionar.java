package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.ColorLibFormValidationPage;

public class Seleccionar implements Task {
    public static Seleccionar elMenuSubmenu() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ColorLibFormValidationPage.LABEL_MENU_FORMS),
                Click.on(ColorLibFormValidationPage.LABEL_SUBMENU_FORM_VALIDATION)
        );
    }
}
