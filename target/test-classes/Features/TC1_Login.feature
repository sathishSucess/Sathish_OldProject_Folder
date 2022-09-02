@login
Feature: Verifying Login on the Adactin Home Page

  Scenario Outline: Log in with valid credentials using login button
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the success message after login "Hello sathishFam!"

    Examples: 
      | username   | password |
      | sathishFam | 741@85BN |

  Scenario Outline: Log in with valid credentials using enter Key
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>" and press Enter key
    Then User should verify the success message after login "Hello sathishFam!"

    Examples: 
      | username   | password |
      | sathishFam | 741@85BN |

  Scenario Outline: Login with Invalid credentials using Login button
    Given User is on the Adactin login page
    When User should login with "<username>" and "<password>"
    Then User should verify the error message after login "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | username   | password |
      | sathishFam | 741@85B |
