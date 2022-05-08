package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavigateDressMenuPage {
    //Dress Tab Menu
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressMenuTab;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement dressCasualDressLink;
    WebDriver driver;

   public NavigateDressMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void verifyIfDressMenuIsWorking(){
        Actions actions = new Actions(driver);
        actions.moveToElement(dressMenuTab).perform();

        Assert.assertTrue(dressCasualDressLink.isDisplayed(), "Casual Dress Link is missing");
    }



}
