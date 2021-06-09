package co.com.choucair.practica.utest.stepdefinitions;

import co.com.choucair.practica.utest.model.*;
import co.com.choucair.practica.utest.questions.Answer;
import co.com.choucair.practica.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SignupUtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Gabriel open the utest page$")
    public void thatGabrielOpenTheUtestPage (  ){
        OnStage.theActorCalled("Gabriel").wasAbleTo(OpenUp.thePage());
    }

    @When("^he type his personal basic data$")
    public void heTypeHisPersonalBasicData ( List<PersonalBasicData> personalBasicData ){
        OnStage.theActorInTheSpotlight().attemptsTo(TypePersonalData.onStep1(personalBasicData.get(0)));
    }

    @When("^he type his address data$")
    public void heTypeHisAddressData (List<AddressData> addressData){
        OnStage.theActorInTheSpotlight().attemptsTo(TypeAddressData.onStep2(addressData.get(0)));
    }

    @When("^he type his device data$")
    public void heTypeHisDeviceData (List<DeviceData> deviceData) {
        OnStage.theActorInTheSpotlight().attemptsTo(TypeDeviceData.onStep3(deviceData.get(0)));
    }

    @When("^he type his security personal access and accept the terms$")
    public void heTypeHisSecurityPersonalAccessAndAcceptTheTerms (List<SecurityData> securityData) {
        OnStage.theActorInTheSpotlight().attemptsTo(TypeSecurityData.onStep4(securityData.get(0)));
    }

    @Then("^he have a welcome to the site$")
    public void heHaveAWelcomeToTheSite (List<WelcomeData> welcomeData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(welcomeData.get(0))));
    }
}
