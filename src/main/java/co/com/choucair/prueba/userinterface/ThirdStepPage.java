package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThirdStepPage extends PageObject {
    public static final Target SELECT_DEVICE = Target.the("device selection ")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_DEVICE = Target.the("specific device selection")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_MODEL = Target.the("model selection")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("specific model selection")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_SYSTEM = Target.the("operating system selection")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SYSTEM = Target.the(" specific operating system selection")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_GO = Target.the("button to continue to the next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));
}
