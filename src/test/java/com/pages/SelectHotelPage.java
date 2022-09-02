package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * selectHotel locators
 * 
 * 
 */
public class SelectHotelPage extends BaseClass {
	/**
	 * constructor
	 * getters
	 * methods
	 * private WebElement
	 */
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id = "continue")
	private WebElement btnContinue;
	@FindBy(xpath="//td[contains(text(),'Book')]")
	private WebElement sucessBookHotelMsg;
	@FindBy(xpath="//label[contains(text(),'Please')]")
	private WebElement errSelecthotelMsg;
	@FindBy(xpath="//td[contains(text(),'Select Hotel')]")
	private WebElement suessMsgSelectHotel;
	
	public WebElement getSuessMsgSelectHotel() {
		return suessMsgSelectHotel;
	}

	public WebElement getSucessBookHotelMsg() {
		return sucessBookHotelMsg;
		
	}

	public WebElement getErrSelecthotelMsg() {
		return errSelecthotelMsg;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void selectHotel() {

		loginClick(getRadiobutton());
		loginClick(getBtnContinue());
	}

	public void clickContinue() {

		loginClick(getBtnContinue());
	}

}
