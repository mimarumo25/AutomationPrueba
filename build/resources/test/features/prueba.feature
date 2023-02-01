
#Authors: Miguel Rubide
@regresion
Feature: Login exitoso con usaurio y password
  Como usuario quiero ingrasar a la pagina saucedemo.com
  Para realizar el login ecitoso con usuario y password
@caso1
  Scenario: Login exitoso con usaurio y password
    Given que miguel abre la app saucedemo
    When miguel ingresa usario, password y da clien en el boton login
    Then miguel podra ver en pantalla la palabra dasboard
