Feature: ViewUserById
  As an admin
  I want to view one of existing user by ID
  So that I can manage the chosen data from data posts

  Scenario: GET - As admin I have be able to success to view one of existing user by ID
    Given I set GET method endpoint
    When I enter GET destination URL with Id in parameter
    And I click Send GET HTTP request button
    Then I receive GET valid HTTP response code 200 OK
