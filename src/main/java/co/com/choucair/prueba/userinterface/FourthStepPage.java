package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FourthStepPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("enter password")
            .located(By.xpath("//*[@id='password']"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("enter confirm password")
            .located(By.xpath("//*[@id='confirmPassword']"));
    public static final Target CHECK_TERMS = Target.the("check to accept terms of use")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("check to accept privacy policy")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_GO = Target.the("button to finish")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue']"));


}
