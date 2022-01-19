package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.FirstStepPage;
import co.com.choucair.prueba.userinterface.FourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FourthStep implements Task {
    public static FourthStep registers(){
        return Tasks.instrumented(FourthStep.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Prueba12345.").into(FourthStepPage.INPUT_PASSWORD),
                Enter.theValue("Prueba12345.").into(FourthStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(FourthStepPage.CHECK_TERMS),
                Click.on(FourthStepPage.CHECK_PRIVACY),
                Click.on(FourthStepPage.BUTTON_GO));
    }
}
