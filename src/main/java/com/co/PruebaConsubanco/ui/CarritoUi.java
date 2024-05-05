package com.co.PruebaConsubanco.ui;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUi {

public static final Target TXT_BORRAR = Target.the("eliminar producto").
        located(By.xpath("//a[contains(text(),'Delete')]"));
    public static final Target TXT_CERRARSESION = Target.the("cerrar sesion").
            located(By.xpath("//a[contains(text(),'Log out')]"));


}
