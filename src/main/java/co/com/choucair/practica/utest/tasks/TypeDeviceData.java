package co.com.choucair.practica.utest.tasks;

import co.com.choucair.practica.utest.model.DeviceData;
import co.com.choucair.practica.utest.userinterface.SignupStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class TypeDeviceData implements Task {
    private String strComputer ;
    private String strVersion ;
    private String strLanguage ;
    private String strDevice;
    private String strModel ;
    private String strOp ;

    public TypeDeviceData(String strComputer, String strVersion, String strLanguage, String strDevice, String strModel, String strOp) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strDevice = strDevice;
        this.strModel = strModel;
        this.strOp = strOp;
    }

    public static TypeDeviceData onStep3(DeviceData deviceData) {
        return Tasks.instrumented(TypeDeviceData.class,
                deviceData.getStrComputer(),
                deviceData.getStrVersion(),
                deviceData.getStrLanguage(),
                deviceData.getStrDevice(),
                deviceData.getStrModel(),
                deviceData.getStrOp()
                );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignupStep3Page.DEPLOYABLE_COMPUTER),
                Enter.theValue(strComputer).into(SignupStep3Page.INPUT_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep3Page.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(SignupStep3Page.INPUT_COMPUTER),

                Click.on(SignupStep3Page.DEPLOYABLE_VERSION),
                Enter.theValue(strVersion).into(SignupStep3Page.INPUT_VERSION),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep3Page.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(SignupStep3Page.INPUT_VERSION),

                Click.on(SignupStep3Page.DEPLOYABLE_LANGUAGE),
                Enter.theValue(strLanguage).into(SignupStep3Page.INPUT_LANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep3Page.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(SignupStep3Page.INPUT_LANGUAGE),

                Click.on(SignupStep3Page.DEPLOYABLE_DEVICE),
                Enter.theValue(strDevice).into(SignupStep3Page.INPUT_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep3Page.INPUT_DEVICE),
                Hit.the(Keys.ENTER).into(SignupStep3Page.INPUT_DEVICE),

                Click.on(SignupStep3Page.DEPLOYABLE_MODEL),
                Enter.theValue(strModel).into(SignupStep3Page.INPUT_MODEL),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep3Page.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(SignupStep3Page.INPUT_MODEL),

                Click.on(SignupStep3Page.DEPLOYABLE_OP),
                Enter.theValue(strOp).into(SignupStep3Page.INPUT_OP),
                Hit.the(Keys.ARROW_DOWN).into(SignupStep3Page.INPUT_OP),
                Hit.the(Keys.ENTER).into(SignupStep3Page.INPUT_OP),

                Click.on(SignupStep3Page.BUTTON_NEXT)
                );
    }
}
