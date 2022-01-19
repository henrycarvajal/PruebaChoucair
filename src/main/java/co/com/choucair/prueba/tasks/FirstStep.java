package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.FirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class FirstStep implements Task {
    public static FirstStep registerUser(){
        return Tasks.instrumented(FirstStep.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Yoana").into(FirstStepPage.INPUT_NAME),
                Enter.theValue("Valest").into(FirstStepPage.INPUT_LASTNAME),
                Enter.theValue("yoana@pruebas3.com").into(FirstStepPage.INPUT_EMAIL),
                Click.on(FirstStepPage.INPUT_DATE_MONTH),
                Click.on(FirstStepPage.INPUT_DATE_DAY),
                Click.on(FirstStepPage.INPUT_DATE_YEAR),
                Enter.theValue("Spanish").into(FirstStepPage.INPUT_LANGUAGES),
                SendKeys.of(Keys.ENTER).into(FirstStepPage.INPUT_LANGUAGES),
                Click.on(FirstStepPage.BUTTON_GO));


    }
}
