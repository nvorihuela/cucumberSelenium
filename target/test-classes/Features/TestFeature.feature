Feature: Test Feature

  Scenario: Go Page
    When User navigate to: 'https://www.saucedemo.com/'

  @Test
  Scenario Outline: Login Page
    Given User navigate to: 'https://www.saucedemo.com/'
    When User login with user: '<user>'
    And User complete with password: '<password>'
    And User click button "Login"

    Examples:
      |user| password|
      |standard_user|secret_sauce|
     |performance_glitch_user |secret_sauce|


  Scenario: Open browser
    And User navigate to: 'https://www.saucedemo.com/'
    And User click button "Login"
