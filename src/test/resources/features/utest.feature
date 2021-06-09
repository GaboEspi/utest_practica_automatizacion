# autor: gabriel jaime espitia genes
@stories
Feature: UTest
  As a user,
  i want to sign up in utest.com,
  to finally have created an account
  @scenario1
  Scenario: SignUp on the utest page
    Given that Gabriel open the utest page
    When he type his personal basic data
      |strFirstName|strLastName|strEmail|month|day|year|languages|
      |gabriel|espitia         |gab@hotm.com|May|17|1993|spanish |
    And he type his address data
      |strCity|strPostalCode|strCountry|
      |cerete |230550       |colombia  |
    And he type his device data
      |strComputer|strVersion|strLanguage|strDevice|strModel|strOp|
      |Windows|2000|Spanish|Xiaomi|Redmi Note 9s|Android 10|
    And he type his security personal access and accept the terms
      |strPassword|
      |Gab34*.**$%gb|
    Then he have a welcome to the site
      |strWelcomeMessage|
      |Welcome to the world's largest community of freelance software testers!|