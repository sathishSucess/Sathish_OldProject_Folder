package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * login page step
 * 
 * 
 */
public class TC1_LoginStep extends BaseClass {

	/**
	 * annotation
	 * pageObjectmanager
	 */
	PageObjectManager pom=new PageObjectManager();
	
	
	
	@Given("User is on the Adactin login page")
	public void userIsOnTheAdactinLoginPage() throws FileNotFoundException, IOException {
		
		
		
	}

	@When("User should login with {string} and {string}")
	public void userShouldLoginWithAnd(String username, String password) {
		pom.getLoginPage().login(username, password);
		
		
	}

	@When("User should login with {string} and {string} and press Enter key")
	public void userShouldLoginWithAndAndPressEnterKey(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithEnterKey(username, password);
		
		
		
	}

	

	@Then("User should verify the error message after login {string}")
	public void userShouldVerifyTheErrorMessageAfterLogin(String expected) {

		Assert.assertEquals("VerifyInvalidMsg", expected,getText(pom.getLoginPage().getErorMsg()));
		
		
		
	}

}
