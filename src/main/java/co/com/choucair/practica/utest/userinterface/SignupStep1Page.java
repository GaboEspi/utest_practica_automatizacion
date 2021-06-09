package co.com.choucair.practica.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignupStep1Page {
    public static final Target INPUT_FIRSTNAME = Target.the("to type name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("to type last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("to type email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("to select month of birthday")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("to select day of birthday")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("to select year of birthday")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE= Target.the("to type language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXT = Target.the("go to the next step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
