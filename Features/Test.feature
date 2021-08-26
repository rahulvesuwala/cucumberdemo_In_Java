Feature:Facebook Login
  Scenario:  Verification To Login
    Given Open Chrome Browser
    When Facebook Home Page Open "https://www.facebook.com/"
    When Enter Username "rahul.alphabin@gmail.com" & Password "Rahul@123"
    Then Click On Login Button.
    When VerifyUser "Vesuwala Rahul"
    But Logout In Facebook
    And Close Browser

