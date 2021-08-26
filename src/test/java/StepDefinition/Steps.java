package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import PageObjects.Login;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;


public class Steps
{       WebDriver driver;

    @Given("Open Chrome Browser")
    public void Open_Chrome_Browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\rahul\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }


    @When("Facebook Home Page Open {string}")
    public void facebook_home_page_open(String Url) {
        driver.get(Url);
    }


    @When("Enter Username {string} & Password {string}")
    public void Enter_The_Username_and_Password(String Email,String Password)
    {
        Login loginpage = new Login(driver);
        loginpage.enterFullName(Email);
        loginpage.enterPassword(Password);

    }

    @Then("Click On Login Button.")
    public void Login_Button()
    {
        Login loginpage = new Login(driver);
        loginpage.submitLogin();

    }
    @When("VerifyUser {string}")
    public void verify_user(String Name) {

        Login loginpage = new Login(driver);
        loginpage.getCheckName();
        String actualString = loginpage.getUserName();
        String expectedSrting = Name;
        Assert.assertEquals(actualString, expectedSrting, "User should be Enter Valid UserName & PassWord\n");

    }

    @But("Logout In Facebook")
    public void logout_In_Facebook() {
        Login loginpage = new Login(driver);
        loginpage.accountOpen();
        loginpage.logOut();
    }


    @And("Close Browser")
    public void Close_Browser()  {
               driver.quit();
    }
}
