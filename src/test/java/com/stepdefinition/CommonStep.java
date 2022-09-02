package com.stepdefinition;

import static org.junit.Assert.assertEquals;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * coomenStep
 * 
 * 
 */
public class CommonStep extends BaseClass {
	
	/**
	 *method
	 *annototation
	 *assert 
	 */
	
	
	PageObjectManager pom=new PageObjectManager();
	@Then("User should verify the success message after login {string}")
	public void userShouldVerifyTheSuccessMessageAfterLogin(String expectedMsg) {
	    Assert.assertEquals("VerifySucessMsg", expectedMsg,getAttributeValue(pom.getSearcHotelPage().getSucessMsg(), "value"));
	    		
	}
	

	
	
}
