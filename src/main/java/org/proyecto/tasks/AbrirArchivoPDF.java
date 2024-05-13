package org.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import static org.proyecto.tasks.DeshabilitarSSL.disableSSL;
import static org.proyecto.userinterface.PaginaTarifario.*;


public class AbrirArchivoPDF implements Task {

    public static AbrirArchivoPDF AbrirPDF (){
        return Tasks.instrumented(AbrirArchivoPDF.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(btn_abrir_pdf),
                Switch.toNewWindow()
        );
        disableSSL();
    }
}
