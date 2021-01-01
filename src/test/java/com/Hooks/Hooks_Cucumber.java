package com.Hooks;

import Factory.DriverFactory;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class Hooks_Cucumber
{

    private DriverFactory driver_factory;
    private ConfigReader config_reader;
    private Properties properties;
    private WebDriver driver;


    @Before
    public void Setup() throws IOException
    {
        config_reader = new ConfigReader();
        properties = config_reader.InitializeConfigFile();


        String BrowserName = properties.getProperty("BrowserName");
        driver_factory = new DriverFactory();
        driver = driver_factory.BrowserInitialization(BrowserName);

        driver.get(properties.getProperty("Url"));
    }

//    OR


//    @Before("@Regression")
//    public void Setup(Scenario sc)
//    {
//        System.out.println("***** Installing Application *****");
//        System.out.println("--> " +sc.getName() +" <--");  //Print scenario name
//    }

    /*
      @After: Order count is reversed
      order=1 will be executed first then order=0
     */

    @After(order = 0)
    public void TearDown()
    {
        driver_factory.QuitDriver();
    }

    @After(order = 1)
    public void OnFailure(Scenario sc)
    {
        if(sc.isFailed())
        {
            //Take Screenshot
            String ScreenshotName = sc.getName().replaceAll(" ", "_");

            byte[] SourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            sc.attach(SourcePath, "image/png", ScreenshotName);
        }
    }

}
