package starter.tasks.iframe;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ui.Link;
import net.serenitybdd.screenplay.waits.Wait;
import starter.interactions.*;
import starter.interactions.Open;

import static starter.userinterface.IframeUserInterface.CONTENT_BODY;

public class ChangeStyle {

    public static Performable toIframeletter(){
        return Task.where("{0} change style letter",
                Click.on(Link.containing("iFrame")),
                Select.allTextIframe(),
                Open.theIframe("mce_0_ifr"),
                Write.textInTheIframe("Ejemplo"),
                Close.theIframe(),
                Select.allTextIframe(),
                Change.letterSizeIframe("Heading 1"),
                Select.allTextIframe(),
                Change.allFontTextIframe("Italic"),
                Change.allColorTextIframe("Red"),
                Change.AllAlignTextIframe("Center"),
                Open.theIframe("mce_0_ifr"),
                Click.on(CONTENT_BODY)
        );
    }

}
