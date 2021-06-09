package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.AddressData;
import co.com.choucair.practica.utest.userinterface.SignupStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class TypeAddressData implements Task {
    private String strCity ;
    private String strPostalCode;
    private String strCountry ;

    public TypeAddressData(String strCity, String strPostalCode, String strCountry) {
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
    }

    public static TypeAddressData onStep2(AddressData addressData) {
        return Tasks.instrumented(TypeAddressData.class,
                                    addressData.getStrCity(),
                                    addressData.getStrPostalCode(),
                                    addressData.getStrCountry());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCity).into(SignupStep2Page.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep2Page.INPUT_CITY),
                Hit.the(Keys.ENTER).into(SignupStep2Page.INPUT_CITY),
                Enter.theValue(strPostalCode).into(SignupStep2Page.INPUT_POSTALCODE),
                Click.on(SignupStep2Page.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(SignupStep2Page.INPUT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep2Page.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(SignupStep2Page.INPUT_COUNTRY),
                Click.on(SignupStep2Page.BUTTON_NEXT)
        );
    }
}
