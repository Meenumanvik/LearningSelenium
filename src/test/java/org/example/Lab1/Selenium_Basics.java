package org.example.Lab1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium_Basics {
    @Test
    public void VerifyDemo()
    {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://demo.applitools.com");
        System.out.println(driver.getTitle()    );
    }
}
