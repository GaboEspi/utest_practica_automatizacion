package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.PersonalData;
import co.com.choucair.practica.utest.userinterface.UtestStartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.practica.utest.userinterface.SignupStep1Page.*;

public class TypePersonalInformation implements Task {
    private List<PersonalData> personalData;

    public TypePersonalInformation(List<PersonalData> personalData) {
        this.personalData = personalData;
    }

    public static TypePersonalInformation with(List<PersonalData> personalData){
        return Tasks.instrumented(TypePersonalInformation.class
                , personalData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestStartPage.JOIN_BUTTON),
                Enter.theValue(personalData.get(0).getStrFirstName()).into(INPUT_FIRSTNAME),
                Enter.theValue(personalData.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(personalData.get(0).getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(personalData.get(0).getMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(personalData.get(0).getDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(personalData.get(0).getYear()).from(SELECT_YEAR),
                Enter.theValue(personalData.get(0).getLanguages()).into(INPUT_LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE),
                Click.on(BUTTON_NEXT)
        );
    }
}
