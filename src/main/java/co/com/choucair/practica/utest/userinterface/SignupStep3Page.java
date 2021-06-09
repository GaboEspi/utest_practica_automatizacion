package co.com.choucair.practica.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignupStep3Page {
    public static final Target DEPLOYABLE_COMPUTER = Target.the("to activate input_computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER = Target.the("to type computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target DEPLOYABLE_VERSION = Target.the("to activate input_version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION = Target.the("to type version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target DEPLOYABLE_LANGUAGE = Target.the("to activate input_language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE = Target.the("to type language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target DEPLOYABLE_DEVICE = Target.the("to activate input_device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_DEVICE = Target.the("to type device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target DEPLOYABLE_MODEL = Target.the("to activate input_model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL = Target.the("to type model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target DEPLOYABLE_OP = Target.the("to activate input_op")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OP = Target.the("to type op")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target BUTTON_NEXT = Target.the("to next step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
