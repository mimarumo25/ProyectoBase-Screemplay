@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través un globo informativo.

  @CasoExitoso
  Scenario: Digiligenciamiento exitoso del formulario Popup Validation
  no se presenta ningún mensaje de validación.

    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation
      | strRequired | strSelect | strMultipleSelect | strMultipleSelect2 | strUrl              | strEmail          | strPassword | strConfirmPassword | strMinimumFieldSize | strMaximumFieldSize | strNumber | strIP          | strDate       | strDateEarlier |
      | a        | Tennis | Tennis          | Golf             | http://tenis.com | tenis@tenis.com |      123 |              123 |             123456 |             123456 |    123 | 192.168.3.1 | 2011-12-01 | 2011-12-01   |
    Then Verifico ingreso exitoso