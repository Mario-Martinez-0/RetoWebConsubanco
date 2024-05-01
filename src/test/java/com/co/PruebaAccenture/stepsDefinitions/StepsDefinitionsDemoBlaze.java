package com.co.PruebaAccenture.stepsDefinitions;


import com.co.PruebaAccenture.models.InicioData;
import com.co.PruebaAccenture.models.RegistroData;
import com.co.PruebaAccenture.questions.ValidacionCerrarsession;
import com.co.PruebaAccenture.questions.ValidarRegistro;
import com.co.PruebaAccenture.tasks.CarritoTask;
import com.co.PruebaAccenture.tasks.InicioSesionTask;
import com.co.PruebaAccenture.tasks.ProductoTask;
import com.co.PruebaAccenture.tasks.RegistroTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static com.co.PruebaAccenture.utils.KillBrowser.processes;
import static org.hamcrest.Matchers.equalTo;

public class StepsDefinitionsDemoBlaze {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Dado("que estoy en la página de inicio de Product Store")
    public void queEstoyEnLaPáginaDeInicioDeProductStore() {
        OnStage.theActorCalled("Jose").attemptsTo(Open.url("https://www.demoblaze.com/"));
    }

    @Cuando("lleno el formulario de registro con mis datos")
    public void llenoElFormularioDeRegistroConMisDatos(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroTask.registrar(RegistroData.setData(dataTable).get(0)));
    }

    @Entonces("debería estar registrado exitosamente en Product Store {string}")
    public void deberíaEstarRegistradoExitosamenteEnProductStore(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidarRegistro.validarRegistro(), equalTo(mensaje))
        );
    }

    @Dado("que estoy en la página de inicio de Product Store inicio sesión con mis credenciales")
    public void queEstoyEnLaPáginaDeInicioDeProductStoreInicioSesiónConMisCredenciales(DataTable data) {
        OnStage.theActorInTheSpotlight().attemptsTo(InicioSesionTask.inicio(InicioData.setData(data).get(0)));

    }


    @Cuando("selecciono la {string} y agrego el {string} al carrito")
    public void seleccionoLaYAgregoElAlCarrito(String categoria, String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoTask.producto(categoria, producto));
    }


    @Y("eliminamo el producto y cerramos sesión")
    public void eliminamoElProductoYCerramosSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(CarritoTask.carrito());
    }

    @Entonces("regreso a la pagina principal")
    public void regresoALaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("La compra se valida correctamente",
                        ValidacionCerrarsession.ValidacionCompra())
        );
    }

    @Before
    public void matarNavegador() throws IOException, InterruptedException {
        processes("chromedriver");
    }



}