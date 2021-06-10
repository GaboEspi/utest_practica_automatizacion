package co.com.choucair.practica.utest.stepdefinitions;

import co.com.choucair.practica.utest.model.*;
import co.com.choucair.practica.utest.questions.Answer;
import co.com.choucair.practica.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SignupUtestStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Gabriel get the utest page$")
    public void thatGabrielGetTheUtestPage (  ){
        theActorCalled("Gabriel").wasAbleTo(OpenUp.thePage());
    }

    @When("^he registers$")
    public void heRegisters ( List<PersonalData> data ){
        theActorInTheSpotlight().attemptsTo(TypePersonalInformation.with(data),
                TypeAddressInformation.with(data),
                TypeDeviceInformation.with(data),
                TypeSecurityInformation.with(data)
                );
    }

    @Then("^he has registered$")
    public void heHasRegistered (List<WelcomeData> welcomeData) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(welcomeData)));
    }
}
