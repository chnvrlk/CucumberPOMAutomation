@SmokeTest
Feature: Login Test with Scenario Outline

  Scenario Outline: Success Login

    Given Go to website
    And Navigate to Login Page
    When Type Valid "<user>" user and "<pass>" password
    Then Verify Success Message
    Examples:
      |user | pass|
      |cihanvarlik99@gmail.com | Cihn06+- |
      |cihanvarlik100@gmail.com | Cihn06++ |
      |cihanvarlik101@gmail.com | Cihn06-- |

