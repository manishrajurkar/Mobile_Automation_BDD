# Created by mrajurka at 3/1/2022
Feature: # Calculation Application
  # This feature is created to write the scenarios required for Calculator testing

  Scenario: # Launch the Application and perform addition of two numbers
    # Enter steps here
  Given Appium server is running with device connected using wifi
    And User accepts the agreement
    When User enter number 2
    And Clicks on "+" button
    And User enter number 5
    And clicks on "=" button
    Then Verify result is number 7