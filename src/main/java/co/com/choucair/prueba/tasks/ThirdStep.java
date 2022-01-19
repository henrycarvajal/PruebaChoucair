package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.SecondStepPage;
import co.com.choucair.prueba.userinterface.ThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


public class ThirdStep implements Task {
    public static ThirdStep register() {return Tasks.instrumented(ThirdStep.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ThirdStepPage.SELECT_DEVICE),
                Enter.theValue("Apple").into(ThirdStepPage.INPUT_DEVICE),
                SendKeys.of(Keys.ENTER).into(ThirdStepPage.INPUT_DEVICE),
                Click.on(ThirdStepPage.SELECT_MODEL),
                Enter.theValue("iPhone 11").into(ThirdStepPage.INPUT_MODEL),
                SendKeys.of(Keys.ENTER).into(ThirdStepPage.INPUT_MODEL),
                Click.on(ThirdStepPage.SELECT_SYSTEM),
                Enter.theValue("iOS 14.3").into(ThirdStepPage.INPUT_SYSTEM),
                SendKeys.of(Keys.ENTER).into(ThirdStepPage.INPUT_SYSTEM),
                Click.on(ThirdStepPage.BUTTON_GO));

    }
}
