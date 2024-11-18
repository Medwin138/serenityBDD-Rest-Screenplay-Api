package com.EdwinLaguna.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ListUsersSteps {

    private Response response;

    @Given("que accedo al servicio de listar usuarios de ReqRes")
    public void accederServicio() {
        baseURI = "https://reqres.in";
    }

    @When("realizo una solicitud GET al endpoint {string}")
    public void realizoUnaSolicitudGETAlEndpoint(String endpoint) {
        response = given()
                .log().all()
                .get(endpoint);
        response.then()
                .log().all();
    }


    @Then("la respuesta debe contener la lista de usuarios en la pagina {int}")
    public void laRespuestaDebeContenerLaListaDeUsuariosEnLaPagina(Integer pagina) {
        response.then().body("page", equalTo(pagina));
    }

    @And("el estado de la respuesta debe ser {int}")
    public void validarEstadoRespuesta(int statusCode) {
        response.then().statusCode(statusCode);
    }
}