package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * 
 * 
 * 
 */
public class TC3_SelectHotelStep extends BaseClass {

	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should select the Hotel and Click Continue button")
	public void userShouldSelectTheHotelAndClickContinueButton() {
	   pom.getSelectHotelPage().selectHotel();
	   
	}
	@Then("User should verify the page after Hotel selection by {string}")
	public void userShouldVerifyThePageAfterHotelSelectionBy(String expected) {
	  Assert.assertEquals("VerifyBookHotelSucessMsg", expected,getText(pom.getSelectHotelPage().getSucessBookHotelMsg()));
	}
	@Then("User should Click Continue button without selecting hotel")
	public void userShouldClickContinueButtonWithoutSelectingHotel() {
	   pom.getSelectHotelPage().clickContinue();
	}
	@Then("User should verify the error message {string}")
	public void userShouldVerifyTheErrorMessage(String expected) {
	   Assert.assertEquals("VerifySelectHotelErrorMsg", expected,getText(pom.getSelectHotelPage().getErrSelecthotelMsg()));
	}



	
	
	
	
}
