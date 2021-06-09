package co.com.choucair.practica.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SignupWelcomePage {
    public static final Target WELCOME_TEXT = Target.the("welcome message on finally step")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
