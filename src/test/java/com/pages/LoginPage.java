package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * loginpage locators 
 * 
 * 
 */
public class LoginPage extends BaseClass {
	/**
	 * constructor
	 * getters
	 * methods
	 * private WebElement
	 * throws AWTException
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//login Locator
		@FindBy(id="username")
		private  WebElement txtUserName;
		@FindBy(id="password")
		private  WebElement txtPassWord;
		@FindBy(id="login")
		private  WebElement loginBtn;
		@FindBy(xpath="//b[contains(text(),'Invalid Login')]")
		private WebElement erorMsg;
		
		//Getter only
		
		

		
		public WebElement getErorMsg() {
			return erorMsg;
		}
		
		public  WebElement getTxtUserName() {
			return txtUserName;
		}
		public  WebElement getTxtPassWord() {
			return txtPassWord;
		}
		public  WebElement getLoginBtn() {
			return loginBtn;
		}
	public void login(String username, String password) {
		sendkeys(getTxtUserName(), username);
		sendkeys(getTxtPassWord(), password);
		loginClick(getLoginBtn());

	}

	public void loginWithEnterKey(String username, String password) throws AWTException {
		sendkeys(getTxtUserName(), username);
		sendkeys(getTxtPassWord(), password);
		roboTab();
		roboTab();
		roboEnter();
		
		}
	
	
}
