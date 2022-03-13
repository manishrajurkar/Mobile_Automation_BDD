# Created by mrajurka at 3/1/2022
Feature: # Calculation Application
  # This feature is created to write the scenarios required for Calculator testing

  Scenario: # Launch the Application and perform addition of two numbers
    # Enter steps here
    Given Appium server is running and Android device Is connected
    And Calculation Application is Launched
    And User accepts the agreement
    When User enter number 2
    And Clicks on "+" button
    And User enter number 5
    And Clicks on "=" button
    Then Verify result is number 7