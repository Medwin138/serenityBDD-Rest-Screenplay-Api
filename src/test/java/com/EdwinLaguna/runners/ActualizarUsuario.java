package com.EdwinLaguna.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/UpdateUser.feature"},
        glue = {"com.EdwinLaguna.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class ActualizarUsuario {
}