package com.automation.test;

import org.testng.annotations.Test;

public class NavigateCategoriesTests extends BaseTest{

    @Test
    public void verifyIfWomensMenuIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
    }

    @Test
    public void verifyIfT_ShirtLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfT_ShirtLinkIsWorking();
    }


}
