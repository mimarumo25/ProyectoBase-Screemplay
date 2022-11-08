package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ColorLibLoginPage;

public class Login implements Task {
    private String strUsuario;
    private String strClave;
    public Login(String strUsuario,String strClave) {
        this.strUsuario = strUsuario;
        this.strClave = strClave;
    }

    public static Login conCredenciales(String strUsuario, String strClave) {
        return Tasks.instrumented(Login.class,strUsuario,strClave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strUsuario).into(ColorLibLoginPage.LOGIN_INPUT_USERNAME),
                Enter.theValue(strClave).into(ColorLibLoginPage.LOGIN_INPUT_PASSWORD),
                Click.on(ColorLibLoginPage.LOGIN_BUTTON_SINGIN)
        );
    }
}
