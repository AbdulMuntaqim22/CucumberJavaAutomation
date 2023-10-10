@tag
Feature: Login

Background:
Given The user navigate to this URL: "https://www.saucedemo.com"

  @tag1
  Scenario Outline: Verify the login functionality works with valid credentails of each role
    Given The user is on Login Page
    When The user enters "<username>" and "<password>"
    And The user clicks on the login button
    Then the user is navigated to Dashboard

Examples:     
| username  							| password  	 | 
| standard_user 					| secret_sauce | 
| problem_user 						| secret_sauce |
| performance_glitch_user | secret_sauce |

@tag1
Scenario: Verify the login functionality does not work with Invalid credentails
  Given The user is on Login Page
  When The user enters "standard_user" and "mustard_sauce"
  And The user clicks on the login button
  Then The following validation is displayed: Epic sadface: Username and password do not match any user in this service
