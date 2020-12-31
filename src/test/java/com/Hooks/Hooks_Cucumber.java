package com.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks_Cucumber
{

//    @Before
//    public void Setup(Scenario sc)
//    {
//        System.out.println("***** Installing Application *****");
//        System.out.println("--> " +sc.getName() +" <--");  //Print scenario name
//    }

//    OR


    @Before("@Regression")
    public void Setup(Scenario sc)
    {
        System.out.println("***** Installing Application *****");
        System.out.println("--> " +sc.getName() +" <--");  //Print scenario name
    }


    @After
    public void TearDown()
    {
        System.out.println("***** Closing Application *****");
    }

}
