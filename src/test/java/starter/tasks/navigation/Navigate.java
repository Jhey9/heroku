package starter.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toIframe(){
        return Task.where("{0} enter iframe ",
                Open.url("https://the-internet.herokuapp.com/frames")
                );
    };

    public static Performable toMultipleWindows(){
        return Task.where("{0} go the page Multiple windows",
            Open.url("https://the-internet.herokuapp.com/windows")
        );
    }

    public static Performable toThePage() {
        return Task.where("{0} the page",
                Open.url("https://the-internet.herokuapp.com")
        );
    }

    public static Performable toJavascriptAlerts() {
        return Task.where("{0} go to alerts",
                Open.url("https://the-internet.herokuapp.com/javascript_alerts")

        );
    }
}
