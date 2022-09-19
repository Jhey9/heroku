package starter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/play/playing_whit_alerts.feature",
        glue = "starter.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@alert3",
        publish = true

)
public class PlayWhitAlertsRunner {

}
