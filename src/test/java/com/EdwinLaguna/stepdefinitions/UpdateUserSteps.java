package com.EdwinLaguna.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserSteps {

    private static String updatedUserData = "{\n" +
            "  \"name\": \"morpheus\",\n" +
            "  \"job\": \"zion resident\"\n" +
            "}"; // Datos actualizados del usuario

    private io.restassured.response.Response response;

    @Given("que tengo un ID de usuario existente 2")
    public void queTengoUnIDDeUsuarioExistente() {
        // Aquí solo estamos preparando el escenario, el ID 2 ya está predeterminado
    }

    // El método ahora acepta un parámetro para el endpoint
    @When("realizo una solicitud PUT al endpoint {string} con datos actualizados")
    public void realizoUnaSolicitudPUTAlEndpointConDatosActualizados(String endpoint) {
        // Realizar la solicitud PUT con los datos actualizados
        response = given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .body(updatedUserData)
                .when()
                .put(endpoint); // Usamos el parámetro 'endpoint' que se pasa desde el feature

        // Imprimir la respuesta completa en la consola
        System.out.println("Response: " + response.asString());
    }

    @Then("la respuesta debe indicar que el usuario fue actualizado exitosamente con un estado de 200")
    public void laRespuestaDebeIndicarQueElUsuarioFueActualizadoExitosamenteConUnEstadoDe200() {
        // Verifica que el estado de la respuesta sea 200
        response.then().statusCode(200);
    }

    @Then("debe devolver los datos actualizados")
    public void debeDevolverLosDatosActualizados() {
        // Verifica que la respuesta contiene los datos actualizados
        response.then()
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("zion resident"));
    }
}
