package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * searchHotelStep
 * 
 * 
 */
public class TC2_SearchHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@Then("User should Search hotel by select fields with {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelBySelectFieldsWithAnd(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {

		pom.getSearcHotelPage().searchHotels(string, string2, string3, string4, string5, string6, string7, string8);

	}

	@Then("User should verify Select Hotel Page after Search Hotel page {string}")
	public void userShouldVerifySelectHotelPageAfterSearchHotelPage(String expecttedMsg) {
		Assert.assertEquals("VerifySucessSelectHotelMsg", expecttedMsg,getText(pom.getSelectHotelPage().getSuessMsgSelectHotel()));
		
	}

	@Then("User should Search hotel by mandatory fields with {string}, {string}, {string}, {string} and {string}")
	public void userShouldSearchHotelByMandatoryFieldsWithAnd(String string, String string2, String string3,
			String string4, String string5) {
		pom.getSearcHotelPage().searchHotelsMandotory(string, string2, string3, string4, string5);
	}

	@Then("User should verify the error messages after Search Hotel {string} and {string}")
	public void userShouldVerifyTheErrorMessagesAfterSearchHotelAnd(String expectCheckIn, String expectCheckOut) {

		Assert.assertEquals("VerifyCheckInErrorMsg", expectCheckIn,getText(pom.getSearcHotelPage().getErrCheckInMsg()));
		Assert.assertEquals("VerifyCheckOutErrorMsg", expectCheckOut,getText(pom.getSearcHotelPage().getErrCheckOutMsg()));
	}

	@Then("Click Search button")
	public void clickSearchButton() {
		pom.getSearcHotelPage().searchHotels();
	}

	@Then("User should verify the error messages in the Search Hotel page {string}")
	public void userShouldVerifyTheErrorMessagesInTheSearchHotelPage(String expected) {
Assert.assertEquals("VerifySelectLocatoinErrorMsg", expected,getText(pom.getSearcHotelPage().getErrLocationSelectionMsg()));
		
		
		
	}

}
