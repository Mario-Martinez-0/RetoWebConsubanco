package com.co.PruebaAccenture.tasks;

import com.co.PruebaAccenture.ui.CarritoUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CarritoTask implements Task {


    public static CarritoTask carrito() {
        return Instrumented.instanceOf(CarritoTask.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoUi.TXT_BORRAR),
                Click.on(CarritoUi.TXT_CERRARSESION));
    }
}
