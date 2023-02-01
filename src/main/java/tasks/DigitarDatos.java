package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

public class DigitarDatos implements Task {
    public static DigitarDatos llenar() {
        return Tasks.instrumented(DigitarDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(LoginPage.TXT_USER),
                Enter.theValue("secret_sauce").into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
}
