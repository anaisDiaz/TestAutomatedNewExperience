package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theDuckDuckGoHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(accountPage.class)
        );
    }

    public static Performable theRegisterPage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(registerPage.class)
        );
    }


}