package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.PersonalBasicData;
import co.com.choucair.practica.utest.userinterface.SignupStep1Page;
import co.com.choucair.practica.utest.userinterface.UtestStartPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class TypePersonalData implements Task {
    private String strFirstName ;
    private String strLastName ;
    private String strEmail ;
    private String month ;
    private String day ;
    private String year ;
    private String languages;

    public TypePersonalData(String strFirstName, String strLastName, String strEmail, String month, String day, String year, String languages) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.month = month;
        this.day = day;
        this.year = year;
        this.languages = languages;
    }

    public static TypePersonalData onStep1(PersonalBasicData personalBasicData){
        return Tasks.instrumented(TypePersonalData.class
                , personalBasicData.getStrFirstName()
                ,personalBasicData.getStrLastName()
                ,personalBasicData.getStrEmail()
                ,personalBasicData.getMonth()
                ,personalBasicData.getDay()
                ,personalBasicData.getYear()
                ,personalBasicData.getLanguages());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestStartPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(SignupStep1Page.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(SignupStep1Page.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(SignupStep1Page.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(month).from(SignupStep1Page.SELECT_MONTH),
                SelectFromOptions.byVisibleText(day).from(SignupStep1Page.SELECT_DAY),
                SelectFromOptions.byVisibleText(year).from(SignupStep1Page.SELECT_YEAR),
                Enter.theValue(languages).into(SignupStep1Page.INPUT_LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep1Page.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(SignupStep1Page.INPUT_LANGUAGE),
                Click.on(SignupStep1Page.BUTTON_NEXT)
        );
    }
}
