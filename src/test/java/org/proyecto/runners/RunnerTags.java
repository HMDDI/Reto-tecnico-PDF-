package org.proyecto.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/base.feature"

        },
        glue = "org.proyecto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
