package com.StepDefinition;

import Factory.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginPage_Steps
{

    private String LoginTitle;

    private LoginPage login_page = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page()
    {
        DriverFactory.GetDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page()
    {
        LoginTitle = login_page.LoginPageTitle();
    }

    @Then("login page title should be {string}")
    public void login_page_title_should_be(String ExpectedLoginPageTitle)
    {

        Assert.assertEquals(ExpectedLoginPageTitle, LoginTitle);
    }

//    @Given("user is on login page")
//    public void user_is_on_login_page()
//    {
//
//    }

    @When("user enters username {string}")
    public void user_enters_username(String Username) throws InterruptedException
    {
        System.out.println("--> " +Username);
        login_page.EnterUsername(Username);
    }

    @When("enters password {string}")
    public void enters_password(String Password)
    {
        login_page.EnterPassword(Password);
    }

    @When("clicks on login button")
    public void clicks_on_login_button()
    {
        login_page.ClickLoginBtn();
    }

    @Then("home page title should be {string}")
    public void home_page_title_should_be(String ExpectedHomePageTitle) throws InterruptedException
    {
        Thread.sleep(5000);
        String ActualHomePageTitle = DriverFactory.GetDriver().getTitle();
        Assert.assertEquals(ExpectedHomePageTitle, ActualHomePageTitle);

    }

}
