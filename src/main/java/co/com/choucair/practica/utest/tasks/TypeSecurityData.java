package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.SecurityData;
import co.com.choucair.practica.utest.userinterface.SignupStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TypeSecurityData implements Task {
    private String strPassword;

    public TypeSecurityData(String strPassword) {
        this.strPassword = strPassword;
    }

    public static TypeSecurityData onStep4(SecurityData securityData) {
        return Tasks.instrumented(TypeSecurityData.class,securityData.getStrPassword());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(SignupStep4Page.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(SignupStep4Page.INPUT_PASSWORD_CONFIRM),
                Click.on(SignupStep4Page.CHECK_TERM),
                Click.on(SignupStep4Page.CHECK_POLICY),
                Click.on(SignupStep4Page.BUTTON_NEXT)
        );
    }
}
