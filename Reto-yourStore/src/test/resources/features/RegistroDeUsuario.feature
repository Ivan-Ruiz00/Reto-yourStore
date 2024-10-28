Feature: Purchase of producto
  As a yourStore user
  I want to buy few products
  So that I can receive them

  Scenario Outline:
    Given that the user is at the main page
    When the user selects a "<category>"
    And chooses "<firstProduct>" and "<secondProduct>"
    And completes the checkout as a guest
    Then the user should watch a confirmation message on the screen
    Examples:
      | category | firstProduct | secondProduct |
    ##@externaldata@parametros/Datos.xlsx@Datos
   |Phones   |HTC Touch HD   |iPhone|
