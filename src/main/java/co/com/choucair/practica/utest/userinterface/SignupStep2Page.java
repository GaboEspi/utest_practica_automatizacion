package co.com.choucair.practica.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignupStep2Page {
    public static final Target INPUT_CITY = Target.the("to input city")
            .located(By.id("city"));
    public static final Target INPUT_POSTALCODE = Target.the("to input postalcode")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("to activate input_country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY = Target.the("to type country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT = Target.the("to next step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
