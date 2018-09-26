#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginRegisterLink
Feature: Demo Tous page testing

  Scenario: Visit the demo tours page
    Given user is on demo tours page
    When user cliks the register link
    Then user should see registration page
 
 

  @UserRegister
  Scenario Outline: User Registers his details for login
    Given User is on Register page
    When User enters valid "<UserName>" and "<Password> " and "<Confirmpassword>"
    And Clicks the login button
    Then User landed on the home page

    Examples: 
      | UserName | Password | Confirmpassword |
      | ptguser  | user1980 | user1980        |
      | ptguser1 | user1980 | user1980        |
      | ptguser2 | user1980 | user1980        |
