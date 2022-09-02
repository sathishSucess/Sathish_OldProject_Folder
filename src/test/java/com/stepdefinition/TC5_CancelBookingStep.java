
package com.stepdefinition;

import java.io.IOException;

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
public class TC5_CancelBookingStep extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should cancel Booked Id")
	public void userShouldCancelBookedId() throws IOException {
		
	    pom.getCancelBookingPage().cancelOrderId("value");
	}
	
	
	@Then("User should cancel Existing Id {string}")
	public void userShouldCancelExistingId(String string) {
	   pom.getCancelBookingPage().existingOrderCancel(string);
		
	}



	@Then("User should Verify cancelation message {string}")
	public void userShouldVerifyCancelationMessage(String expected) {
	   implecitlyWait(30);
		Assert.assertEquals("VerifyCancelMsg", expected,getText(pom.getCancelBookingPage().getErrorMsg()));
		
		
		
	}
	
	
}
