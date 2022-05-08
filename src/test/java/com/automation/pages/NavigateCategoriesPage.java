package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavigateCategoriesPage {

   //Verify If Womens Menu Is Working
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womensMenu;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement topsText;

    //Verify If T-Shirts Link Is Working
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement tShirtLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement tShirtText;

    WebDriver driver;

    public NavigateCategoriesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void verifyIfWomensMenuIsWorking(){
        Actions actions = new Actions(driver);
        actions.moveToElement(womensMenu).perform();

        Assert.assertTrue(topsText.isDisplayed(), "Tops text is missing");
    }

    public void verifyIfT_ShirtLinkIsWorking(){
        tShirtLink.click();

        Assert.assertTrue(tShirtText. isDisplayed(), "T-Shirt text is missing");
    }
}
