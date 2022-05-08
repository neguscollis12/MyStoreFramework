package com.automation.test;

import org.testng.annotations.Test;

public class NavigateCategoriesTests<groups> extends BaseTest{

    @Test
    public <groups> void verifyIfWomensMenuIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
    }
    //Tops
    @Test (groups = {"Tops"})
    public void verifyIfT_ShirtLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfT_ShirtLinkIsWorking();
    }

    @Test (groups = {"Tops"})
    public void verifyIfBlouseLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfBlouseLinkIsWorking();
    }
    //Dress
    @Test (groups = {"Dress"})
    public void verifyIfSummerDressLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfSummerDressesLinkIsWorking();
    }

    @Test (groups = {"Dress"})
    public void verifyIfCasualDressLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfCasualDressesLinkIsWorking();
    }

    @Test (groups = {"Dress"})
    public void verifyIfEvenDressLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfEveningDressesLinkIsWorking();
    }


}
