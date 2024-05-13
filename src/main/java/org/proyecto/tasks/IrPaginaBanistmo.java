package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.proyecto.userinterface.PaginaBanistmo;

public class IrPaginaBanistmo implements Task {
    private PaginaBanistmo paginaInicio;
    public static IrPaginaBanistmo urlApp() {
        return Tasks.instrumented(IrPaginaBanistmo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicio));
    }

}
