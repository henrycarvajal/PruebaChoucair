package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondStepPage extends PageObject {
    public static final Target INPUT_CITY = Target.the("enter city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("enter postal code")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("select list country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("enter country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_GO = Target.the("button to continue to the next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));
}
