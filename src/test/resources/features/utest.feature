# autor: gabriel jaime espitia genes
@stories
Feature: UTest
  As a user,
  i want to sign up in utest.com,
  to finally have created an account
  @scenario1
  Scenario Outline: SignUp on the utest page
    Given that Gabriel get the utest page
    When he registers
      |strFirstName|strLastName|strEmail|month|day|year|languages|strCity|strPostalCode|strCountry|strComputer|strVersion|strLanguage|strDevice|strModel|strOp|strPassword|
      |<strFirstName>|<strLastName>|<strEmail>|<month>|<day>|<year>|<languages>|<strCity>|<strPostalCode>|<strCountry>|<strComputer>|<strVersion>|<strLanguage>|<strDevice>|<strModel>|<strOp>|<strPassword>|
    Then he has registered
      |strWelcomeMessage|
      |<strWelcomeMessage>|
    Examples:
      |strFirstName|strLastName|strEmail|month|day|year|languages|strCity|strPostalCode|strCountry|strComputer|strVersion|strLanguage|strDevice|strModel|strOp|strPassword|strWelcomeMessage|
      |gabriel|espitia         |gabb@hotm.com|May|17|1993|spanish |cerete |230550       |colombia  |Windows|2000|Spanish|Xiaomi|Redmi Note 9s|Android 10|Gab34*.**$%gb|Welcome to the world's largest community of freelance software testers!|
      |juan|perez|perez@geml.com|June|17|1998|english|cerete|230550|colombia|Windows|2000|Spanish|Xiaomi|Redmi Note 9s|Android 10|Gmm88*.##$%gb|Welcome to the world's largest community of freelance software testers!|
