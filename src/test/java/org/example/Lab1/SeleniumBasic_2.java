package org.example.Lab1;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBasic_2 {
    @Description("Verify the Title")
    @Test
    public void test_Selenium()
    {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        System.out.println("URL verified successfully");
        driver.quit();
    }
}
