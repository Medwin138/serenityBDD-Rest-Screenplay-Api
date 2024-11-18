Feature: Actualizar un usuario existente

  Scenario: Actualizar usuario con ID 2
    Given que tengo un ID de usuario existente 2
    When realizo una solicitud PUT al endpoint "/api/users/2" con datos actualizados
    Then la respuesta debe indicar que el usuario fue actualizado exitosamente con un estado de 200
    And debe devolver los datos actualizados
