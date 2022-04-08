Feature: Open main page

  Scenario: Open main page from home page in English locale
    Given Home page is opened
    When User clicks on Main Page Link
    Then Welcome block is displayed