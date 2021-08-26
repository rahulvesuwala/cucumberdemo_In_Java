package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css=("#email"))
    WebElement userName;

    @FindBy(css=("input[name='pass']"))
    WebElement password;

    @FindBy(css=("button[name='login']"))
    WebElement logInButton;

    @FindBy(css=("[aria-label='Account']"))
    WebElement account;

    @FindBy(how = How.XPATH, using = "//*[text()='Vesuwala Rahul']")
    WebElement checkName;

    @FindBy(how = How.XPATH, using = "//span[@dir='auto'][text()='Log Out']")
    @CacheLookup
    WebElement logOut;


    public void enterFullName(String fullName) {

        userName.sendKeys(fullName);
    }

    public void enterPassword(String passWord) {

        password.sendKeys(passWord);
    }

    public void submitLogin()
    {

        logInButton.click();
    }

    public WebElement getCheckName()
    {
        return checkName;
    }

    public String getUserName()
    {
        return getCheckName().getText();
    }

    public void accountOpen(){
        account.click();

    }

    public void logOut(){

        logOut.click();

    }
}
