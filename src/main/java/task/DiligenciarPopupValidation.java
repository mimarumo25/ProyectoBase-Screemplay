package task;

import model.PopupValidationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ColorLibFormValidationPage;


public class DiligenciarPopupValidation implements Task {

    private List<PopupValidationData> data;

    public DiligenciarPopupValidation(List<PopupValidationData> data2) {
        this.data = data2;
    }

    public static DiligenciarPopupValidation llenarFormulario(List<PopupValidationData> data2) {
        return new DiligenciarPopupValidation(data2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrRequired()).into(ColorLibFormValidationPage.INPUT_REQUIRED),
                SelectFromOptions.byVisibleText(data.get(0).getStrSelect()).from(ColorLibFormValidationPage.SELECT_SPORT),
                SelectFromOptions.byVisibleText(data.get(0).getStrMultipleSelect()).from(ColorLibFormValidationPage.SELECT_SPORT2),
                SelectFromOptions.byVisibleText(data.get(0).getStrMultipleSelect2()).from(ColorLibFormValidationPage.SELECT_SPORT2),
                Enter.theValue(data.get(0).getStrUrl()).into(ColorLibFormValidationPage.INPUT_URL),
                Enter.theValue(data.get(0).getStrEmail()).into(ColorLibFormValidationPage.INPUT_EMAIL),
                Enter.theValue(data.get(0).getStrPassword()).into(ColorLibFormValidationPage.INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrConfirmPassword()).into(ColorLibFormValidationPage.INPUT_CONFIRM_PASSWORD),
                Enter.theValue(data.get(0).getStrMinimumFieldSize()).into(ColorLibFormValidationPage.INPUT_MINIMUNFIELDSIZE),
                Enter.theValue(data.get(0).getStrMaximumFieldSize()).into(ColorLibFormValidationPage.INPUT_MAXIMUNFIELDSIZE),
                Enter.theValue(data.get(0).getStrNumber()).into(ColorLibFormValidationPage.INPUT_NUMBER),
                Enter.theValue(data.get(0).getStrIP()).into(ColorLibFormValidationPage.INPUT_IP),
                Enter.theValue(data.get(0).getStrDate()).into(ColorLibFormValidationPage.INPUT_DATE),
                Enter.theValue(data.get(0).getStrDateEarlier()).into(ColorLibFormValidationPage.INPUT_DATE_EARLIER),
                Click.on(ColorLibFormValidationPage.BUTTON_VALIDATE)
        );
    }
}
