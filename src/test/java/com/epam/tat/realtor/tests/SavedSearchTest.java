package com.epam.tat.realtor.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SavedSearchTest extends BaseTest{

    private static final String CITY_NAME = "New York, NY";

    @BeforeTest
    public void logIn(){
        homePageStep.userLogIn();
        homePageStep.openSavedSearches()
                .clearAllOldSavedSearches()
                .moveToHomePage();
    }

    @Test
    public void savedSearch(){
        homePageStep.enterCityName(CITY_NAME)
                .clickSearchButton();
    }

}
