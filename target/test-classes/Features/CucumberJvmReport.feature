Feature: Validation of Facebook Login page

  Background: 
    Given User launch Facebook Web Application
    Then User verify Facebook Loginwebpage is displayed

  Scenario Outline: TC01_Validation of Loginpage with Multiples invalid credentials
    When User enters invalid "<username>" and "<password>"
    And User clicks Login Button
    Then User verify Error message is displayed

  Scenario Outline: TC02_Validation of Loginpage with Multiples invalid credentials
    When User enters invalid "<username>" and "<password>"
    And User clicks Login Button
    Then User verify Error message is displayed

  Scenario Outline: TC03_Validation of Loginpage with Multiples invalid credentials
    When User enters invalid "<username>" and "<password>"
    And User clicks Login Button
    Then User verify Error message is displayed

    Examples: 
      | username | password |
      | Greens   |   123456 |
      | Greens   | Abc@123  |
      | Greens   |   123456 |
