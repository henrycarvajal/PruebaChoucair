package co.com.choucair.prueba.stepdefinitions;

import co.com.choucair.prueba.tasks.FirstStep;
import co.com.choucair.prueba.tasks.OpenUp;
import co.com.choucair.prueba.tasks.Register;
import co.com.choucair.prueba.tasks.SecondStep;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairPruebaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that yoana needs a new user to enter utest$")
    public void thatYoanaNeedsANewUserToEnterUtest() {
        OnStage.theActorCalled("Yoana").wasAbleTo(OpenUp.thepage(), (Register.onThePage()));
    }

    @When("^you go to utest\\.com and click on join today you will find the form to create a new user$")
    public void youGoToUtestComAndClickOnJoinTodayYouWillFindTheFormToCreateANewUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(FirstStep.registerUser(), (SecondStep.toRegister()));
    }

    @Then("^he fills out the form and obtains the new user to enter utest$")
    public void heFillsOutTheFormAndObtainsTheNewUserToEnterUtest() {;
    }

}
