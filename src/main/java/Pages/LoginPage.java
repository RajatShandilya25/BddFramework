package Pages;

import Factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

    private WebDriver driver = DriverFactory.GetDriver();


    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailTxtBox;

    @FindBy(id = "passwd")
    WebElement PassTxtBox;

    @FindBy(id = "SubmitLogin")
    WebElement LoginBtn;


    //Constructor
    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }


    //Actions
    public String LoginPageTitle()
    {
        return driver.getTitle();
    }


    public void EnterUsername(String Username) throws InterruptedException
    {
        Thread.sleep(3000);
        EmailTxtBox.sendKeys(Username);
    }

    public void EnterPassword(String Password)
    {
        PassTxtBox.sendKeys(Password);
    }

    public void ClickLoginBtn()
    {
        LoginBtn.click();
    }
}
