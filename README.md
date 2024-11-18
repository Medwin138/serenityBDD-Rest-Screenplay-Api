# 📝 Proyecto de Prueba de Admisión - Edwin Laguna 🚀

¡Bienvenidos! Este es un proyecto de prueba de admisión que he creado para demostrar mis habilidades en automatización de pruebas utilizando herramientas como Serenity, Cucumber y Gherkin.

## 📌 Descripción del Proyecto

Este proyecto consiste en la automatización de pruebas para una aplicación web, utilizando **Serenity BDD** y **Cucumber** como herramientas principales. Los tests están definidos utilizando el lenguaje de comportamiento **Gherkin** para asegurar que las pruebas sean legibles tanto para desarrolladores como para stakeholders no técnicos.

El objetivo principal de este proyecto es mostrar las capacidades de Serenity para gestionar pruebas y generar reportes detallados de las ejecuciones, así como la integración de Cucumber para definir escenarios de pruebas utilizando Gherkin.

## 🔧 Herramientas Utilizadas

- **Serenity BDD**: Framework de pruebas que soporta pruebas en Java.
- **Cucumber**: Framework que permite escribir pruebas en un lenguaje natural utilizando Gherkin.
- **Gherkin**: Lenguaje utilizado para escribir los escenarios de prueba de manera comprensible.
- **JUnit**: Framework para ejecutar los tests y manejar los resultados.
- **Gradle**: Herramienta de automatización para gestionar las dependencias y ejecutar los tests.

## 🧑‍💻 Tests y Características del Proyecto

En este proyecto, he creado varios **tests** utilizando **Gherkin**, los cuales están organizados en **features**. Cada **feature** contiene uno o varios escenarios que describen el comportamiento esperado de la aplicación.

### 📑 Tests Incluidos:

1. **Login Feature**  
   Prueba para verificar que el inicio de sesión se realiza correctamente.
   ```gherkin
   Feature: Login
     In order to access the application
     As a user
     I want to log in with valid credentials

     Scenario: Successful login with valid credentials
       Given I am on the login page
       When I enter my username and password
       And I click on the login button
       Then I should see the homepage
2. **Feature: Find a user information** 
    Este escenario prueba la búsqueda de un usuario con un ID válido.
     ```gherkin
     Feature: find a user information
        I as a app need to find a user with your ID because i need show your information

     Scenario: find a user valid
        When he find a user with id 1
        Then response status code is 200
        And user whit first name "George" and last name "Bluth" should be correct

3. **Feature: List all users information**
   Este escenario prueba la consulta de todos los usuarios de la API.
   ```gherkin
   Feature: list all users information
   I as a app need to list all users because i need show your information

   Scenario: list all users
    When he list all users
    Then response status code is 200
    And all 6 the expected users should be returned


4. **Feature: Listar usuarios en la página 2**
   Este escenario prueba la paginación de la consulta de usuarios en la página 2.

   ```gherkin
   Feature: Listar usuarios
   Como usuario del servicio ReqRes
   Quiero listar usuarios en la página 2
   Para obtener información sobre ellos.

   Scenario: Listar usuarios en la página 2
    Given que accedo al servicio de listar usuarios de ReqRes
    When realizo una solicitud GET al endpoint "/api/users?page=2"
    Then la respuesta debe contener la lista de usuarios en la pagina 2
    And el estado de la respuesta debe ser 200


5. **Feature: Actualizar un usuario existente**
   Este escenario prueba la actualización de los datos de un usuario con un ID específico.
   ```gherkin
   Feature: Actualizar un usuario existente
    Scenario: Actualizar usuario con ID 2
    Given que tengo un ID de usuario existente 2
    When realizo una solicitud PUT al endpoint "/api/users/2" con datos actualizados
    Then la respuesta debe indicar que el usuario fue actualizado exitosamente con un estado de 200
    And debe devolver los datos actualizados    

📂 Estructura del Proyecto
src/main/java: Código fuente del proyecto.
src/test/java: Implementación de los tests automatizados.
src/test/resources: Archivos de configuración y features en Gherkin.
build.gradle: Configuración de Gradle para gestionar las dependencias y ejecución de los tests.
🚀 Instrucciones de Uso
Para ejecutar las pruebas, sigue estos pasos:

Clona este repositorio:

bash
Copiar código
git clone https://github.com/tu_usuario/tu_repositorio.git
Navega al directorio del proyecto:

bash
Copiar código
cd tu_repositorio
Ejecuta las pruebas con Gradle:

bash
Copiar código
./gradlew clean test
Los resultados de las pruebas se generarán en el directorio build/serenity, donde podrás ver un reporte detallado de las ejecuciones.

📊 Reportes de Pruebas
Una vez ejecutadas las pruebas, los reportes generados estarán disponibles en build/serenity :


📞 Contacto
Si tienes alguna pregunta o sugerencia, no dudes en contactarme:

Nombre: Edwin Laguna
Correo: milleredwin85@gmail.com
¡Gracias por revisar mi proyecto! 😊

