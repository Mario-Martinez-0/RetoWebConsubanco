package com.co.PruebaConsubanco.questions;

import com.co.PruebaConsubanco.ui.InicioSesionUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCerrarsession implements Question<Boolean> {

    public static ValidacionCerrarsession validacionCerrarsession() {
        return new ValidacionCerrarsession();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return InicioSesionUi.OPCION_INICIOSESION.resolveFor(actor).isDisplayed();
    }
}
