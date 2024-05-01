package com.co.PruebaAccenture.questions;

import com.co.PruebaAccenture.ui.InicioSesionUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCerrarsession implements Question<Boolean> {

    public static ValidarRegistro ValidacionCompra() {
        return new ValidarRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return InicioSesionUi.OPCION_INICIOSESION.resolveFor(actor).isDisplayed();
    }
}
