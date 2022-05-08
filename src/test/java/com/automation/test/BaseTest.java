package com.automation.test;

import com.automation.pages.NavigateDressMenuPage;
import com.automation.pages.NavigateWomensMenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    NavigateWomensMenuPage navigateCategoriesPage;
    NavigateDressMenuPage navigateDressMenuPage;

    @BeforeMethod (groups = {"Dress" , "Tops"})
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "/Users/cce/Desktop/TEST/MyStoreFramework/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        navigateCategoriesPage = new NavigateWomensMenuPage(driver);
        navigateDressMenuPage = new NavigateDressMenuPage(driver);
    }

    @AfterMethod (groups = {"Dress", "Tops"})
    public void cleanUp(){
        driver.quit();
    }
}
