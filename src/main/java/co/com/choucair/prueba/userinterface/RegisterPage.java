package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public static final Target BUTTON_REGISTER = Target.the("button join today")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//ul[@class='nav navbar-nav']//a[@class='unauthenticated-nav-bar__sign-up']"));
}
