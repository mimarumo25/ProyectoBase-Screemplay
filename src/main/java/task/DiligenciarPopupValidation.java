package task;

import model.PopupValidationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ColorLibFormValidationPage;

import java.util.List;

public class DiligenciarPopupValidation implements Task {

    private PopupValidationData data;

    public DiligenciarPopupValidation(PopupValidationData data) {
        this.data = data;
    }

    public static DiligenciarPopupValidation llenarFormulario(PopupValidationData data2) {
        return new DiligenciarPopupValidation(data2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getStrRequired()).into(ColorLibFormValidationPage.INPUT_REQUIRED),
                SelectFromOptions.byVisibleText(data.getStrSelect()).from(ColorLibFormValidationPage.SELECT_SPORT),
                SelectFromOptions.byVisibleText(data.getStrMultipleSelect()).from(ColorLibFormValidationPage.SELECT_SPORT2),
                SelectFromOptions.byVisibleText(data.getStrMultipleSelect2()).from(ColorLibFormValidationPage.SELECT_SPORT2),
                Enter.theValue(data.getStrUrl()).into(ColorLibFormValidationPage.INPUT_URL),
                Enter.theValue(data.getStrEmail()).into(ColorLibFormValidationPage.INPUT_EMAIL),
                Enter.theValue(data.getStrPassword()).into(ColorLibFormValidationPage.INPUT_PASSWORD),
                Enter.theValue(data.getStrConfirmPassword()).into(ColorLibFormValidationPage.INPUT_CONFIRM_PASSWORD),
                Enter.theValue(data.getStrMinimumFieldSize()).into(ColorLibFormValidationPage.INPUT_MINIMUNFIELDSIZE),
                Enter.theValue(data.getStrMaximumFieldSize()).into(ColorLibFormValidationPage.INPUT_MAXIMUNFIELDSIZE),
                Enter.theValue(data.getStrNumber()).into(ColorLibFormValidationPage.INPUT_NUMBER),
                Enter.theValue(data.getStrIP()).into(ColorLibFormValidationPage.INPUT_IP),
                Enter.theValue(data.getStrDate()).into(ColorLibFormValidationPage.INPUT_DATE),
                Enter.theValue(data.getStrDateEarlier()).into(ColorLibFormValidationPage.INPUT_DATE_EARLIER),
                Click.on(ColorLibFormValidationPage.BUTTON_VALIDATE)
        );
    }
}
