package com.automation.test;

import org.testng.annotations.Test;

public class NavigateCategoriesTests<groups> extends BaseTest{

    @Test
    public <groups> void verifyIfWomensMenuIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
    }

    @Test (groups = {"group 1"})
    public void verifyIfT_ShirtLinkIsWorking(){
        navigateCategoriesPage.verifyIfWomensMenuIsWorking();
        navigateCategoriesPage.verifyIfT_ShirtLinkIsWorking();
    }


}
