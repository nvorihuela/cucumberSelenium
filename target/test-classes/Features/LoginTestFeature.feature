Feature: Test Feature

  
  Scenario Outline: Login OK: '<NameTestCase>'
    Given Abrir navegador en la página: 'https://www.saucedemo.com/'
    When Completar campo username con usuario: '<user>'
    And Completar campo Password con contraseña: '<password>'
    And User click button "Login"
    Then Se visualiza pagina principal de inventario.

    Examples:
      |NameTestCase  |user         | password|
      | User y Password ok: standard |standard_user|secret_sauce|
      | User y Password ok: performance |performance_glitch_user|secret_sauce|


  @Test
  Scenario Outline: Login Fail: '<NameTestCase>'
    Given Abrir navegador en la página: 'https://www.saucedemo.com/'
    When Completar campo username con usuario: '<user>'
    And Completar campo Password con contraseña: '<password>'
    And User click button "Login"
    Then Se muestra mensaje de validación: '<message>'

    Examples:
    |NameTestCase  |user         | password|message|
    | Usuario bloqueado |locked_out_user|secret_sauce|Epic sadface: Sorry, this user has been locked out.|
    |  Sin completar usuario y contraseña | ||  Epic sadface: Username is required      |
    |  Sin completar contraseña  | standard_user||     Epic sadface: Password is required   |
    |  User inexistente | user|secret_sauce|   Epic sadface: Username and password do not match any user in this service       |
    |  Password fail | standard_user|fail|   Epic sadface: Username and password do not match any user in this service         |

