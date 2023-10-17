Feature: Add Products Test Feature

  @Test
  Scenario Outline: Agregar producto al carro: '<NameTestCase>'
    Given Abrir navegador en la página: 'https://www.saucedemo.com/'
    And Completar campo username con usuario: '<user>'
    And Completar campo Password con contraseña: '<password>'
    And User click button "Login"
    And Se visualiza pagina principal de inventario.
    When  Clickear en botón 'Add to cart' de algun producto
    Then Se verifica que se agrega el producto.
    Examples:
      |NameTestCase  |user         | password|
      | desde pagina principal |standard_user|secret_sauce|

  @Test
  Scenario Outline: Eliminar producto del carro: '<NameTestCase>'
    Given Abrir navegador en la página: 'https://www.saucedemo.com/'
    And Completar campo username con usuario: '<user>'
    And Completar campo Password con contraseña: '<password>'
    And User click button "Login"
    And Se visualiza pagina principal de inventario.
    And Clickear en botón 'Add to cart' de algun producto
    When Click en botón 'Remove' del producto agregado
    Then Se verifica que se elimina el producto agregado.
    Examples:
      |NameTestCase  |user         | password|
      | desde pagina principal |standard_user|secret_sauce|