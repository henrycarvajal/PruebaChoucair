package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.FirstStepPage;
import co.com.choucair.prueba.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FirstStep implements Task {
    public static FirstStep registerUser(){
        return Tasks.instrumented(FirstStep.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Yoana").into(FirstStepPage.INPUT_NAME),
                Enter.theValue("Valest").into(FirstStepPage.INPUT_LASTNAME),
                Enter.theValue("yoana@prueba.com").into(FirstStepPage.INPUT_EMAIL),
                Click.on(FirstStepPage.INPUT_DATE_MONTH),
                Click.on(FirstStepPage.INPUT_DATE_DAY),
                Click.on(FirstStepPage.INPUT_DATE_YEAR),
                Click.on(FirstStepPage.BUTTON_GO));


    }
}
