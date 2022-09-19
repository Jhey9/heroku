package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.tasks.play.Gamble;
import starter.tasks.navigation.Navigate;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static starter.userinterface.JavascriptAlertsUserInterface.RESULT_JS_ALERT;

public class PlayWhitAlertStepDefinitions {
    @Given("{actor} in browsing in javascript alerts")
    public void jheyInBrowsingInJavascriptAlerts(Actor actor) {
        actor.attemptsTo(Navigate.toJavascriptAlerts());
    }
    @When("{actor} enter in Js alert")
    public void heEnterInJsAlert(Actor actor) {
        actor.attemptsTo(Gamble.whitJsAlert());
    }
    @Then("{actor} see {string}")
    public void heSeeYouSuccessfullyClickedAnAlert(Actor actor, String result) {
       actor.attemptsTo( Ensure.that(RESULT_JS_ALERT).hasText(result));
    }
    @When("{actor} enter in Js confirm")
    public void heEnterInJsConfirm(Actor actor) {
        actor.attemptsTo(Gamble.whitJSConfirm());
    }
    @Then("{actor} see {string} in js confirm")
    public void heSeeInJsConfirm(Actor actor, String result) {
        actor.attemptsTo(Ensure.that(RESULT_JS_ALERT).hasText(result));
    }
    @When("{actor} enter in JS Prompt")
    public void heEnterInJSPrompt(Actor actor) {
        actor.attemptsTo(
                Gamble.whitJsPromt()
        );
    }
    @Then("see You entered {string}")
    public void seeYouEnteredChallenge(String result) {
            theActorInTheSpotlight().should(seeThat(the(RESULT_JS_ALERT), containsText(result)));
    }
}