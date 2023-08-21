Feature: Search Test

  @RegressionTest
  Scenario: Search Valid Product

    Given Go to example test website
    And Type product "HP" in the search field
    When Click the search button
    Then Check the valid product

  Scenario: Search invalid Product

    Given Go to example test website
    And Type product "Honda" in the search field
    When Click the search button
    Then Check the invalid product