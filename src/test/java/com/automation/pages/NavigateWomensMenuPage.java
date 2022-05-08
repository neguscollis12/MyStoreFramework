package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavigateWomensMenuPage {

   //Verify If Womens Menu Is Working
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womensMenu;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement topsText;

    //Verify If Tops Link Is Working
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement tShirtLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement tShirtText;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement blouseLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement blouseText;

    //Verify If Dresses Link Is Working
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement casualDressesLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement casualDressText;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement eveningDressesLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement eveningDressesText;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
    WebElement summerDressesLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement summerDressText;



    WebDriver driver;

    public NavigateWomensMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void verifyIfWomensMenuIsWorking(){
        Actions actions = new Actions(driver);
        actions.moveToElement(womensMenu).perform();

        Assert.assertTrue(topsText.isDisplayed(), "Tops text is missing");
    }
    //Tops
    public void verifyIfT_ShirtLinkIsWorking(){
        tShirtLink.click();

        Assert.assertTrue(tShirtText. isDisplayed(), "T-Shirt text is missing");
    }

    public void verifyIfBlouseLinkIsWorking(){
        blouseLink.click();

        Assert.assertTrue(blouseText.isDisplayed(), "Blouse text is missing");
    }

    //Dresses
    public void verifyIfCasualDressesLinkIsWorking(){
        casualDressesLink.click();

        Assert.assertTrue(casualDressText.isDisplayed(), "Casual Dress text is missing");
    }
    public void verifyIfEveningDressesLinkIsWorking(){
        eveningDressesLink.click();

        Assert.assertTrue(eveningDressesText.isDisplayed(), "Evening Dress text is missing");
    }
    public void verifyIfSummerDressesLinkIsWorking(){
        summerDressesLink.click();

        Assert.assertTrue(summerDressText.isDisplayed(), "Summer Dress text is missing");
    }




}
