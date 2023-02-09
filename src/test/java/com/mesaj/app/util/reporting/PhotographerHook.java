package com.mesaj.app.util.reporting;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class PhotographerHook {

    @Autowired
    private WebDriver webDriver;

    @AfterStep
    public void takeScreenShot(Scenario scenario){
        try{
            final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", UUID.randomUUID().toString());

        } catch (WebDriverException wde){
            System.out.println("There was an error taking the screenshot"+ wde.getMessage());
        }

    }


}
