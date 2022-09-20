package starter.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static starter.userinterface.IframeUserInterface.MENUITEM_EDIT;
import static starter.userinterface.IframeUserInterface.SELECT_ALL;

public class Select {

    public static Interaction allTextIframe() {
        return Interaction.where("{0} Select all text",
                Click.on(MENUITEM_EDIT),
                Click.on(SELECT_ALL)
        );
    }
}