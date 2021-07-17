package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before (value = "@login", order = 1)
    public void setupLoginScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @Before ("@db")
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        //If my scenario fails
        // take a screenshot

        //scenario.isFailed --> is scenario fails: returns true
        if (scenario.isFailed()){

            byte [] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());

        }



        System.out.println("AFTER---Teardown steps are being applied...");
        //Driver.closeDriver()
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("----setup applying for each step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("----teardown applying for each step");
    }

}
