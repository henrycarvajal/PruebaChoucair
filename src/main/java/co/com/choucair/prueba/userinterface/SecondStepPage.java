package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondStepPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("enter city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("enter postal code")
            .located(By.id("zip"));
    public static final Target BUTTON_GO = Target.the("enter postal code")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));
}
