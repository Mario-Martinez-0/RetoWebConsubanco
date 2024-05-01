# Proyecto Serenity BDD con Gradle

Este proyecto utiliza Gradle como sistema de construcción y está configurado para trabajar con Serenity BDD, un marco de trabajo que integra JUnit y Cucumber para pruebas de aceptación automatizadas.

## Requisitos previos

Asegúrate de tener instalado Gradle en tu sistema antes de ejecutar este proyecto. Puedes obtener Gradle desde [https://gradle.org/install/](https://gradle.org/install/).

Además, se requiere Java 11. Asegúrate de tener Java 11 instalado. Puedes descargar Java 11 desde [https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o utilizar una distribución como OpenJDK.


## Configuración del proyecto

El archivo `build.gradle` contiene la configuración del proyecto. Aquí hay un resumen de las configuraciones clave:

### Plugins aplicados

- `java-library`: Plugin para construir bibliotecas Java.
- `net.serenity-bdd.aggregator`: Plugin para la integración con Serenity BDD.
- `eclipse`: Plugin para la integración con Eclipse.

### Repositorios Maven

Se configuran los repositorios Maven Local, Maven Central y JCenter para la resolución de dependencias.

### Dependencias

Las dependencias del proyecto se especifican en la sección `dependencies` del archivo `build.gradle`. Algunas de las dependencias clave incluyen:

- `implementation 'net.serenity-bdd:serenity-cucumber:4.0.19'
- `  implementation group: 'io.cucumber', name: 'datatable', version: "${versionCucumber}"`
- `  testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: "${versionCucumber}"`
- `  implementation group: 'net.serenity-bdd', name: 'serenity-screenplay', version: "${versionSerenity}"`
- `  implementation group: 'net.serenity-bdd', name: 'serenity-screenplay-webdriver', version: "${versionSerenity}"`
- `  implementation group: 'net.serenity-bdd', name: 'serenity-junit', version: "${versionSerenity}"`
- `  implementation group: 'net.serenity-bdd', name: 'serenity-core', version: "${versionSerenity}"`
- `  implementation group: 'net.serenity-bdd', name: 'serenity-report-resources', version: "${versionSerenity}"`
- `  implementation group: 'org.mockito', name: 'mockito-core', version: '3.12.4'`
- `  implementation group: 'org.slf4j', name: 'slf4j-api', version: '2.0.0-alpha5'`
- `  implementation group: 'org.slf4j', name: 'slf4j-simple', version: '2.0.0-alpha5'`
- `  implementation group: 'org.apache.logging.log4j', name: 'log4j-core', version: '2.18.0'`
- `  compileOnly 'org.projectlombok:lombok:1.18.20'`
- ` annotationProcessor 'org.projectlombok:lombok:1.18.20'`

### Tareas y Configuraciones de Pruebas

- `test.finalizedBy(aggregate)`: La tarea `aggregate` se ejecuta después de la ejecución de las pruebas.
- `test.ignoreFailures = true`: Las fallas en las pruebas no detendrán la construcción del proyecto.

### Codificación y Compilación

- Se establece la codificación de las clases Java en UTF-8.
- `gradle.startParameter.continueOnFailure = true`: La construcción continúa incluso si hay fallas en las pruebas.

## Ejecución del Proyecto

Para ejecutar las pruebas, utiliza el siguiente comando Gradle:

```bash
gradle test --tests *RunnerTags* --info --tests *CA01*
```
```bash
gradle test --tests *RunnerTags* --info --tests *E2E*
```


## Resultados 
Los resultados de la ejecucion los podemos encontrar en la ruta ***/target/site/serenity/index.html***
![img.png](img.png)
