package starter.tasks.play;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Link;
import starter.interactions.AlertAction;

import static starter.userinterface.WindowsUserInterface.RESULT_WINDOWS;


public class Gamble {
    public static Performable whitJSConfirm() {
        return Task.where("{0} accept JS Confirm",
                Click.on(Button.withText("Click for JS Confirm")
                ),
                AlertAction.accept()
        );
    }
    public static Performable whitJsAlert() {
        return Task.where("{0} accept js Alert",
                Click.on(
                        Button.withText("Click for JS Alert")
                ),
                AlertAction.accept()
        );
    }
    public static Performable whitJsPromt() {

        return Task.where("{0}, enter name en Js promt",
                Click.on(
                        Button.withText("Click for JS Prompt")
                ),
                AlertAction.sendkeys("Challenge"),
                AlertAction.accept()
        );
    }
    public static Performable whitMultipleWindows() {
        return Task.where("{0} open windows",
            Click.on(Link.containing("Click Here")),
                Switch.toNewWindow(),
                Switch.toTheOtherWindow(),
            Click.on(Link.containing("Click Here")),
                Switch.toNewWindow(),
                Ensure.that(RESULT_WINDOWS).hasText("New Window"),
                Switch.toWindowTitled("new")

        );
    }
}
