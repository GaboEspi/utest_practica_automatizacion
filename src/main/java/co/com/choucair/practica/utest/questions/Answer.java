package co.com.choucair.practica.utest.questions;

import co.com.choucair.practica.utest.model.WelcomeData;
import co.com.choucair.practica.utest.userinterface.SignupWelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question{
    private List<WelcomeData> welcomeData;

    public Answer(List<WelcomeData> welcomeData) {
        this.welcomeData = welcomeData;
    }

    public static Answer toThe(List<WelcomeData> welcomeData) {
        return new Answer(welcomeData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeMessage = Text.of(SignupWelcomePage.WELCOME_TEXT).viewedBy(actor).asString();
        if(welcomeData.get(0).getStrWelcomeMessage().equals(welcomeMessage)){
            return true;
        }else{
            return false;
        }

    }
}
