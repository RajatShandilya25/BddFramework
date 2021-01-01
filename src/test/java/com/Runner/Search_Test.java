package com.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"/Users/praveensharma/IdeaProjects/Cucumber_BDD_Framework/src/test/resources/Feature/LoginPage.feature"},
        glue = {"com.StepDefinition", "com.Hooks"},
//        tags = "not @Sanity",
        plugin = {"pretty"})

public class Search_Test
{

}
