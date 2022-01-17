package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.SecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SecondStep implements Task {
    public static SecondStep toRegister(){
        return Tasks.instrumented(SecondStep.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Bogota").into(SecondStepPage.INPUT_CITY),
                Enter.theValue("111111").into(SecondStepPage.INPUT_POSTAL_CODE),
                Click.on(SecondStepPage.BUTTON_GO));
    }
}
