package com.co.PruebaConsubanco.tasks;

import com.co.PruebaConsubanco.models.InicioData;
import com.co.PruebaConsubanco.ui.InicioSesionUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InicioSesionTask implements Task {
    private InicioData inicioData;

    public InicioSesionTask(InicioData inicioData) {
        this.inicioData = inicioData;
    }

    public static InicioSesionTask inicio(InicioData inicioData) {
        return Instrumented.instanceOf(InicioSesionTask.class).withProperties(inicioData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InicioSesionUi.OPCION_INICIOSESION),
                Enter.theValue(inicioData.getUsuario()).into(InicioSesionUi.TXT_NOMBREUSUARIO),
                Enter.theValue(inicioData.getClave()).into(InicioSesionUi.TXT_CLAVEUSUARIO),
                Click.on(InicioSesionUi.BTN_INICIO));
    }
}