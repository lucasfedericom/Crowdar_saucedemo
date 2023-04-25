Feature: Ingresar a la webapp SauceDemo

  Scenario: Login exitoso con credenciales validas
    Given que el usuario ingresa a la pagina de login de SauceDemo
    When intenta iniciar sesion con el usuario 'standard_user' y la password 'secret_sauce'
    Then se visualiza correctamente el sitio de inventario de Saucedemo

  Scenario: Login fallido por credenciales invalidas
    Given que el usuario ingresa a la pagina de login de SauceDemo
    When intenta iniciar sesion con el usuario 'wrong_user' y la password 'wrong_pass'
    Then el sistema informa que el usuario o la password no coinciden con ningun usuario del sistema

  Scenario: Login fallido por ausencia de username
    Given que el usuario ingresa a la pagina de login de SauceDemo
    When intenta iniciar sesion con el usuario '' y la password 'secret_false'
    Then el sistema informa que el nombre de usuario no fue ingresado

  Scenario: Login fallido por ausencia de password
    Given que el usuario ingresa a la pagina de login de SauceDemo
    When intenta iniciar sesion con el usuario 'standard_user' y la password ''
    Then el sistema informa que la password no fue ingresada

  Scenario: Login fallido por ausencia de nombre de usuario y ausencia de password
    Given que el usuario ingresa a la pagina de login de SauceDemo
    When intenta iniciar sesion con el usuario '' y la password ''
    Then el sistema informa que faltan ambas credenciales

  Scenario: Login exitoso con credenciales validas - FAIL ADREDE
    Given que el usuario ingresa a la pagina de login de SauceDemo
    When intenta iniciar sesion con el usuario 'standard_userasdasd' y la password 'secret_sauceasdasd'
    Then se visualiza correctamente el sitio de inventario de Saucedemo