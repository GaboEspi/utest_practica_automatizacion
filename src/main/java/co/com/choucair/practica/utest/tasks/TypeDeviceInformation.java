package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.practica.utest.userinterface.SignupStep3Page.*;

public class TypeDeviceInformation implements Task {
    List<PersonalData> personalData;

    public TypeDeviceInformation(List<PersonalData> personalData) {
        this.personalData = personalData;
    }

    public static TypeDeviceInformation with(List<PersonalData> personalData) {
        return Tasks.instrumented(TypeDeviceInformation.class,
                personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DEPLOYABLE_COMPUTER),
                Enter.theValue(personalData.get(0).getStrComputer()).into(INPUT_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER),

                Click.on(DEPLOYABLE_VERSION),
                Enter.theValue(personalData.get(0).getStrVersion()).into(INPUT_VERSION),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_VERSION),

                Click.on(DEPLOYABLE_LANGUAGE),
                Enter.theValue(personalData.get(0).getStrLanguage()).into(INPUT_LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE),

                Click.on(DEPLOYABLE_DEVICE),
                Enter.theValue(personalData.get(0).getStrDevice()).into(INPUT_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_DEVICE),
                Hit.the(Keys.ENTER).into(INPUT_DEVICE),

                Click.on(DEPLOYABLE_MODEL),
                Enter.theValue(personalData.get(0).getStrModel()).into(INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MODEL),

                Click.on(DEPLOYABLE_OP),
                Enter.theValue(personalData.get(0).getStrOp()).into(INPUT_OP),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_OP),
                Hit.the(Keys.ENTER).into(INPUT_OP),

                Click.on(BUTTON_NEXT)
                );
    }
}
