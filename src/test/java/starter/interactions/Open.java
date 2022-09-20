package starter.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Switch;

public class Open {

    public static Interaction theIframe(String nameIframe) {
        return Interaction.where("{0} Open Iframe",
                Switch.toFrame(nameIframe)
        );
    }
}
