package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.proyecto.userinterface.PaginaBanistmo.*;


public class IrSeccionTarifario implements Task {
    public static IrSeccionTarifario IrTarifario (){

        return Tasks.instrumented(IrSeccionTarifario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(btn_aceptar_cookies, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(btn_aceptar_cookies),
                Scroll.to(btn_tarifario),
                Click.on(btn_tarifario)
        );

    }
}
