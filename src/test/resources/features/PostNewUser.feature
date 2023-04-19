Feature: PostNewUser
  As an admin
  I want to post a new user
  So that I can add it to the system

  Scenario: POST - As admin I have be able to success to post a new user
    Given I set POST method endpoints
    When I navigate to Body menu
    And I enter POST destination URL
    And I enter new data user in body field
    And I select "raw"
    And I select "JSON" from the text type dropdown
    And I click send POST HTTP request button
    Then I receive valid HTTP response code 201
    And I receive the new data that had been added to the system