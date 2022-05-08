package com.automation.test;

import com.automation.pages.NavigateCategoriesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;
    NavigateCategoriesPage navigateCategoriesPage;

    @BeforeMethod (groups = {"group 1"})
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "/Users/cce/Desktop/TEST/MyStoreFramework/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        navigateCategoriesPage = new NavigateCategoriesPage(driver);
    }

    @AfterMethod (groups = "group 1")
    public void cleanUp(){
        driver.quit();
    }
}
