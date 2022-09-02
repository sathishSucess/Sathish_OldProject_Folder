package com.stepdefinition;

import java.util.List;
import java.util.Map;

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
public class TC4_BookHotelStep extends BaseClass {

	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should Book Hotel by {string}, {string} and {string}")
	public void userShouldBookHotelByAnd(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) {
		
	
		
		List<Map<String, String>> list = dataTable.asMaps();
		Map<String, String> map = list.get(0);
		String s1 = map.get("ccNo");
		String s2 = map.get("ccType");
		String s3 = map.get("ccExpMon");
		String s4 = map.get("ccExpYear");
		String s5 = map.get("ccCVV");
		pom.getBookHotelPage().getCcNumber().sendKeys(s1);
		pom.getBookHotelPage().getCcType().sendKeys(s2);
		pom.getBookHotelPage().getExpmonth().sendKeys(s3);
		pom.getBookHotelPage().getExpyear().sendKeys(s4);
		pom.getBookHotelPage().getCvvNumber().sendKeys(s5);
		pom.getBookHotelPage().bookHotel(string, string2, string3);
		
	}

	@Then("User should verify Booking confirmation Messege {string}")
	public void userShouldVerifyBookingConfirmationMessege(String expectedMsg) {
		Assert.assertEquals("VerifyBookConformation", expectedMsg,getText(pom.getBookHotelPage().getBookConfMsg()));
	}

	@Then("User should click Book now button without entering any fields")
	public void userShouldClickBookNowButtonWithoutEnteringAnyFields() {
		
		pom.getBookHotelPage().bookHotel();
	}

	@Then("User should verify all the error message {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyAllTheErrorMessageAnd(String string, String string2, String string3, String string4,
			String string5, String string6, String string7) {
		
		Assert.assertEquals("VerifyErrorMsg1", string,getText(pom.getBookHotelPage().getErrFrist()));
		Assert.assertEquals("VerifyErrorMsg2", string2,getText(pom.getBookHotelPage().getErrLast()));
		Assert.assertEquals("VerifyErrorMsg3", string3,getText(pom.getBookHotelPage().getErrAdrss()));
		Assert.assertEquals("VerifyErrorMsg4", string4,getText(pom.getBookHotelPage().getErrCredCard()));
		Assert.assertEquals("VerifyErrorMsg5", string5,getText(pom.getBookHotelPage().getErrCardType()));
		Assert.assertEquals("VerifyErrorMsg6", string6,getText(pom.getBookHotelPage().getErrExpmonth()));
		Assert.assertEquals("VerifyErrorMsg7", string7,getText(pom.getBookHotelPage().getErrCardCvv()));
		
		
	}

}
