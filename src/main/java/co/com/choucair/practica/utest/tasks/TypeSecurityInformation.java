package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.PersonalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.practica.utest.userinterface.SignupStep4Page.*;

public class TypeSecurityInformation implements Task {
    private List<PersonalData> personalData;

    public TypeSecurityInformation(List<PersonalData> personalData) {
        this.personalData = personalData;
    }

    public static TypeSecurityInformation with(List<PersonalData> personalData) {
        return Tasks.instrumented(TypeSecurityInformation.class,
                personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(personalData.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(personalData.get(0).getStrPassword()).into(INPUT_PASSWORD_CONFIRM),
                Click.on(CHECK_TERM),
                Click.on(CHECK_POLICY),
                Click.on(BUTTON_NEXT)
        );
    }
}
