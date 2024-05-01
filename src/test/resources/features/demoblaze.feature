#language: es

Característica: Funcionalidades de la página demoblaze
  Como usuario de demoblaze,
  Quiero seleccionar un producto por categoria y agregarlo al carrito
  Para poder eliminarlo y cerrar sesion.

  Antecedentes: Abrir navegador
    Dado que estoy en la página de inicio de Product Store

  @Regresion
  Esquema del escenario: Registro de un nuevo usuario

    Cuando lleno el formulario de registro con mis datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces debería estar registrado exitosamente en Product Store "<mensaje>"

    Ejemplos:
      | usuario      | clave  | mensaje             |
      | CamiloJose53 | 112345 | Sign up successful. |

  @Regresion
  Esquema del escenario: Realizar proceso completo de compra en demoblaze
    Dado que estoy en la página de inicio de Product Store inicio sesión con mis credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Cuando selecciono la "<categoria>" y agrego el "<producto>" al carrito

    Y eliminamo el producto y cerramos sesión

    Entonces regreso a la pagina principal

    Ejemplos:
      | usuario      | clave  | categoria | producto |
      | CamiloJose53 | 112345 | Phones    | Samsung  |