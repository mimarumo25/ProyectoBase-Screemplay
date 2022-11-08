package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorLibFormValidationPage extends PageObject {
    public static final Target HOME_LOGO = Target.the("Logo encontrado en el home de ColorLib")
            .located(By.xpath("//h1[@id='bootstrap-admin-template']"));
    public static final Target LABEL_MENU_FORMS = Target.the("Label menú FORMS")
            .located(By.xpath("//span[contains(text(),'Forms')]"));
    public static final Target LABEL_SUBMENU_FORM_VALIDATION = Target.the("Label submenú FORMS VALIDATIONS")
            .located(By.xpath("(//a[@href='form-validation.html'])[2]"));
    public static final Target HOME_LOGO_FORM_VALIDATION = Target.the("Label ventana Popup Validation")
            .located(By.xpath("//h5[contains(text(),'Popup Validation')]"));
    public static final Target INPUT_REQUIRED = Target.the("Input para el campo Required")
            .located(By.xpath("//input[@id='req']"));
    public static final Target SELECT_SPORT = Target.the("Select para seleccionar deporte")
            .located(By.xpath("//select[@id='sport']"));
    public static final Target SELECT_SPORT2 = Target.the("Select para seleccionar segundo deporte")
            .located(By.xpath("//select[@id='sport2']"));
    public static final Target INPUT_URL = Target.the("Input para el campo URL")
            .located(By.xpath("//input[@id='url1']"));
    public static final Target INPUT_EMAIL = Target.the("Input para el campo E-MAIL")
            .located(By.xpath("//input[@id='email1']"));
    public static final Target INPUT_PASSWORD = Target.the("Input para el campo Password")
            .located(By.xpath("//input[@id='pass1']"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input para el campo Confirm Password")
            .located(By.xpath("//input[@id='pass2']"));
    public static final Target INPUT_MINIMUNFIELDSIZE = Target.the("Input para el campo MINIMUN FIELD SIZE")
            .located(By.xpath("//input[@id='minsize1']"));
    public static final Target INPUT_MAXIMUNFIELDSIZE = Target.the("Input para el campo MAXIMUN FIELD SIZE")
            .located(By.xpath("//input[@id='maxsize1']"));
    public static final Target INPUT_NUMBER = Target.the("Input para el campo NUMBER")
            .located(By.xpath("//input[@id='number2']"));
    public static final Target INPUT_IP = Target.the("Input para el campo IP")
            .located(By.xpath("//input[@id='ip']"));
    public static final Target INPUT_DATE = Target.the("Input para el campo DATE")
            .located(By.xpath("//input[@id='date3']"));
    public static final Target INPUT_DATE_EARLIER = Target.the("Input para el campo DATE EARLIER")
            .located(By.xpath("//input[@id='past']"));
    public static final Target BUTTON_VALIDATE = Target.the("Botón de VALIDATE")
            .located(By.xpath("//input[@value='Validate']"));
    public static final Target POPUP_GLOBOINFORMATIVO = Target.the("Popup de validación sobre cada campo")
            .located(By.xpath("//div[@class='formErrorContent']"));
}
