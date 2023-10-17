Feature: Api Test Feature

  @Test
  Scenario Outline: Consultar departamentos '<NameTestCase>'
    When Consultar departamentos '<EP>'
    Then Verificar existan departamentos


    Examples:
      |NameTestCase          | EP|
      | Existen departamentos |https://www.mercadolibre.com.ar/menu/departments|


