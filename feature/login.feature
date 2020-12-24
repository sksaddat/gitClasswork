
Feature: Title of your feature
  I want to use this template for my feature file

  @smokeTest
  Scenario: Verify all the fields are present in the Accounts object
   Given I open chrome browser
    And I enter  username "test.user@gmail.com.test"
    And I enter  password "Pa55word"
    When I click the login button
    Then I should see the dashboard
    And I click the Accounts tab
    And I click the new button
    And I should see Account Name field
    And I should see Account Number field
    And i should see Type field with different option
    When I click Save button
    Then I should see the record
