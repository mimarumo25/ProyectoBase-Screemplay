package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.ColorLibPage;

public class OpenOut implements Task {
    private ColorLibPage colorLibPage;

    public static OpenOut thePage() {
        return Tasks.instrumented(OpenOut.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(colorLibPage));
    }
}
