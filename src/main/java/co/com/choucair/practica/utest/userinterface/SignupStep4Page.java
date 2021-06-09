package co.com.choucair.practica.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignupStep4Page {
    public static final Target INPUT_PASSWORD = Target.the("to type password")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("to type password again")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERM = Target.the("to accept term of use")
            .located(By.id("termOfUse"));
    public static final Target CHECK_POLICY = Target.the("to accetp privacy and security policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_NEXT = Target.the("to next step")
            .located(By.id("laddaBtn"));
}
