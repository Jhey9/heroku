package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.tasks.navigation.Navigate;
import starter.tasks.play.Gamble;
import static starter.userinterface.WindowsUserInterface.RESULT_WINDOWS;

public class PlayWhitWindowStepDefinitions {

    @Given("{actor} in browsing in multiple windows")
    public void jheyInBrowsingInMultipleWindows(Actor actor) {
        actor.attemptsTo(Navigate.toMultipleWindows());
    }
    @When("{actor} open multiple windows")
    public void heOpenMultipleWindows(Actor actor) {
        actor.attemptsTo(
                Gamble.whitMultipleWindows()
        );
    }

    @Then("{actor} see {string} windows")
    public void heSeeWindows(Actor actor, String result) {
        actor.attemptsTo(Ensure.that(RESULT_WINDOWS).hasText(result));
    }


}
