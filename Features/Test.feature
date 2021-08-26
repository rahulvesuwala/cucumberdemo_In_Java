Feature:Facebook Login
  Scenario:  Verification To Login
    Given Open Chrome Browser
    When Facebook Home Page Open "https://www.facebook.com/"
    When Enter Username "enter" & Password "enter"
    Then Click On Login Button.
    When VerifyUser "Vesuwala Rahul"
    But Logout In Facebook
    And Close Browser

