Feature : validating login function of facebook website.

  Scenario : Validating login function with valid user name and invalid password
      Given user is on Facebook website
      When user should enter user name and password
      And user should click login button
      Then user should validate home page is present or not