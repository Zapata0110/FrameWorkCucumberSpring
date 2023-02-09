package com.mesaj.app.util.driver;


import com.mesaj.app.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver get(Browser browser){

        if (Browser.chrome == browser){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
            return new ChromeDriver();
        }
        if (Browser.firefox == browser){
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
            return new FirefoxDriver();
        }
        if (Browser.edge == browser){
            System.setProperty("webdriver.msedge.driver",
                    System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver.exe");
            return new EdgeDriver();
        }
        throw new IllegalArgumentException("Driver not found for browser:" + browser);
    }
}
