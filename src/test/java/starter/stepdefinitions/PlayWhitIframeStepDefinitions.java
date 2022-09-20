package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.tasks.iframe.ChangeStyle;
import starter.tasks.navigation.Navigate;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static starter.userinterface.IframeUserInterface.CONTENT_BODY;

public class PlayWhitIframeStepDefinitions {

    @Given("{actor} in browsing in the iframe")
    public void jheyInBrowsingInTheIframe(Actor actor) {
       actor.attemptsTo(Navigate.toIframe());
    }

    @When("{actor} enter to the iframe")
    public void heEnterToTheIframe(Actor actor) {
        actor.attemptsTo(ChangeStyle.toIframeletter());
    }

    @Then("he see the {string} changed")
    public void heSeeTheChanged(String word) {

        theActorInTheSpotlight().should(seeThat(the(CONTENT_BODY), containsText(word)));
    }

}
