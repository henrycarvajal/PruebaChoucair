package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirstStepPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("enter name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("enter lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("enter email")
            .located(By.id("email"));
    public static final Target INPUT_DATE_MONTH = Target.the("enter month")
            .located(By.xpath("//select[@name='birthMonth']//option[text()='November']"));
    public static final Target INPUT_DATE_DAY = Target.the("enter day")
            .located(By.xpath("//select[@name='birthDay']//option[text()='1']"));
    public static final Target INPUT_DATE_YEAR = Target.the("enter year")
            .located(By.xpath("//select[@name='birthYear']//option[text()='2002']"));
    public static final Target INPUT_LANGUAGES = Target.the("enter languages")
            .located(By.xpath("//*[@id='languages']/div[1]/input"));
    public static final Target BUTTON_GO = Target.the("button to continue to the next step")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"));

}
