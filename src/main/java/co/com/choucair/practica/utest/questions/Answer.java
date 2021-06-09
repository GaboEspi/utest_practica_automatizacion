package co.com.choucair.practica.utest.questions;

import co.com.choucair.practica.utest.model.WelcomeData;
import co.com.choucair.practica.utest.userinterface.SignupWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question{
    private String strWelcomeMessage;

    public Answer(String strWelcomeMessage) {
        this.strWelcomeMessage = strWelcomeMessage;
    }

    public static Answer toThe(WelcomeData welcomeData) {
        return new Answer(welcomeData.getStrWelcomeMessage());
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeMessage = Text.of(SignupWelcomePage.WELCOME_TEXT).viewedBy(actor).asString();
        if(strWelcomeMessage.equals(welcomeMessage)){
            return true;
        }else{
            return false;
        }

    }
}
