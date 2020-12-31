package com.StepDefinition;

import io.cucumber.java.en.*;

public class Search_Steps
{


    /*
    Background
     */
    @Given("User should be able to login")
    public void user_should_be_able_to_login()
    {
        System.out.println("User has successfully logged-in");
    }


    /*
    Scenario: Search a product
     */
    @And("There should be a search box on Amazon page")
    public void there_should_be_a_search_box_on_amazon_page()
    {
        System.out.println("Search box is present");
    }

    @When("I search for the product {string}")
    public void i_search_for_the_product(String ProductName)
    {
        System.out.println("I searched for " +ProductName);
    }

    @And("price is {string}")
    public void price_is(String ProductPrice)
    {
        System.out.println("and the product price is " +ProductPrice);
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String ProductName)
    {
        System.out.println(ProductName +" is displayed");
    }



    /*
    Scenario: Search a product in app
     */
    @And("There should be a search box on Amazon application")
    public void there_should_be_a_search_box_on_amazon_application()
    {
        System.out.println("Search box is present");
    }

    @When("I search for the product {string} in app")
    public void i_search_for_the_product_in_app(String ProductName)
    {
        System.out.println("I searched for " +ProductName);
    }

    @Then("{string} should be displayed in the results")
    public void should_be_displayed_in_the_results(String ProductName)
    {
        System.out.println(ProductName +" is displayed");
    }
    
    
}
