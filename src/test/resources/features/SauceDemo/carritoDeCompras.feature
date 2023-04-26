Feature: Comprobar funcionamiento del carrito de compras en la webapp de SauceDemo

  Scenario: Agregar exitosamente un producto del inventario en el carrito de compras
    Given que el usuario ingresa a la pagina de login de SauceDemo
    And intenta iniciar sesion con el usuario 'standard_user' y la password 'secret_sauce'
    And se visualiza correctamente el sitio de inventario de Saucedemo
    When agrega un item del inventario al carrito de compras
    Then se visualiza correctamente el producto en el carrito

  Scenario: Comprar exitosamente un producto del inventario ingresando los datos de envío
    Given que el usuario ingresa a la pagina de login de SauceDemo
    And intenta iniciar sesion con el usuario 'standard_user' y la password 'secret_sauce'
    And se visualiza correctamente el sitio de inventario de Saucedemo
    And agrega un item del inventario al carrito de compras
    And se visualiza correctamente el producto en el carrito
    When se confirma la compra de los productos seleccionados ingresando los datos del destinatario
    Then el sistema informa la confirmación de la compra

