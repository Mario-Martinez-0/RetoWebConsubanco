package com.co.PruebaConsubanco.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
        tags = "@E2E",
        glue = "com.co.PruebaConsubanco.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DemoBlazeRunner {

}
