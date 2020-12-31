package com.StepDefinition;

import io.cucumber.java.en.*;

public class Cart_Steps
{


    @Given("product is available")
    public void product_is_available()
    {
        System.out.println("Product is available");
    }

    @When("I open product detail page")
    public void i_open_product_detail_page()
    {
        System.out.println("Product detail page opened");
    }

    @Then("There should be a cart button")
    public void there_should_be_a_cart_button()
    {
        System.out.println("Add to cart button is visible");
    }
}
