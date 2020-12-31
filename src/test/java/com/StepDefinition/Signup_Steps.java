package com.StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import java.util.List;
import java.util.Map;

public class Signup_Steps
{
    @Given("User has the apk file and successfully installed the application")
    public void user_has_the_apk_file_and_successfully_installed_the_application()
    {
        System.out.println("Application successfully installed");
    }

    @When("user launches the app")
    public void user_launches_the_app()
    {
        System.out.println("App is launched");
    }

    @And("Click on SignUp button")
    public void click_on_sign_up_button()
    {
        System.out.println("User clicked the signup button");
    }

    @And("Enter the following details")
    public void enter_the_following_details(DataTable dataTable)
    {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

//        List<List<String>> UserList = dataTable.asLists(String.class);
//
//        for(List<String> it: UserList)
//        {
//            System.out.println(it);
//        }

        List<Map<String, String>> UserMap = dataTable.asMaps(String.class, String.class);
        System.out.println(UserMap);

    }

    @Then("User should be able to successfully signup")
    public void user_should_be_able_to_successfully_signup()
    {
        System.out.println("User is able to successfully signup");
    }

}
