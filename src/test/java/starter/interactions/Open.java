package starter.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ui.Link;

public class Open {

    public static Interaction theIframe(String nameIframe) {
        return Interaction.where("{0} Open Iframe",
                Switch.toFrame(nameIframe)
        );
    }

    //    public static Performable linkContainingName(String name) {
//        return Interaction.where("{0} open link",
//               // Click.on(Link.)
//        )
//    }
}
