package starter.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;

import static starter.userinterface.IframeUserInterface.CONTENT_BODY;

public class Write {

    public static Performable textInTheIframe(String word){
        return Interaction.where("{0} Write in the Iframe",
                Enter.keyValues(word).into(CONTENT_BODY)
        );
    };
}
