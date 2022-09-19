package starter.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Switch;

public class Close {
    public static Interaction theIframe() {
        return Interaction.where("{0} Close the iFrame",
                Switch.toDefaultContext()
        );
    }
}