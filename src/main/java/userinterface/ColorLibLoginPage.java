package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLibLoginPage extends PageObject {
    public static final Target LOGIN_INPUT_USERNAME = Target.the("Campo para ingresar el username")
            .located(By.xpath("//input[@placeholder='Username']"));
    public static final Target LOGIN_INPUT_PASSWORD = Target.the("Campo para ingresar el passwword")
            .located(By.xpath("//input[@placeholder='Password']"));
    public static final Target LOGIN_BUTTON_SINGIN = Target.the("Botón de login")
            .located(By.xpath("//button[contains(text(),'Sign in')]"));
}
