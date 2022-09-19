package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;

public class AlertAction implements Performable {

    public static Performable sendkeys(String name) {
        return Task.where("{0} dismisses the alert dialog",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys(name)
        );
    }

    public static Performable accept() {
        return Task.where("{0} accept alert",
                Switch.toAlert().andAccept()
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().alert();
    }
}