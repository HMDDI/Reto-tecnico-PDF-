package org.proyecto.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.proyecto.questions.ValidarPDF;
import org.proyecto.tasks.AbrirArchivoPDF;
import org.proyecto.tasks.IrPaginaBanistmo;
import org.proyecto.tasks.IrSeccionTarifario;


public class MyStepdefs {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que un usuario ingrse a la pagina de Banistmo")
    public void IralaPaginaBanistmo() {
        OnStage.theActorCalled("actor").wasAbleTo(IrPaginaBanistmo.urlApp());
    }

    @Cuando("seleccione la opcion tarifarios al final de la pagina")
    public void IralaSeccionTarifario() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrSeccionTarifario.IrTarifario());
    }

    @Y("haga click para abrir el archivo PDF de Tarifas de Cuentas de Depósitos")
    public void AbrirPDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirArchivoPDF.AbrirPDF());
    }

    @Entonces("se mostrará el archivo PDF correctamente")
    public void ValidarArchivoPDF() {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPDF.PDF(), Matchers.containsString("Tarifas de cuentas de Depósitos")));
    }

}
