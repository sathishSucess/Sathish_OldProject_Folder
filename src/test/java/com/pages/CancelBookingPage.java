package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * cancelBooking locators
 * 
 * 
 */
public class CancelBookingPage extends BaseClass {
	/**
	 * constructor
	 * getters
	 * methods
	 * private WebElement
	 * return 
	 * 
	 */
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement bookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement orderIdText;

	@FindBy(id = "search_hotel_id")
	private WebElement goButton;

	@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
	private WebElement cancel;

	@FindBy(id = "order_no")
	private WebElement orderNo;

	// oderId Change Dynamically
	@FindBy(xpath = "//input[@value=\"Cancel 3SHTM7067M\"]")
	private WebElement dynOder;

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	@FindBy(xpath = "//label[contains(text(),\"The\")]")
	private WebElement errorMsg;

	public WebElement getDynOder() {
		return dynOder;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getOrderText() {
		return orderIdText;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void cancelOrderId(String attributeName) {
		String attributeValue = getAttributeValue(getOrderNo(), attributeName);
		loginClick(getBookedItinerary());
		sendkeys(getOrderText(), attributeValue);
		

		loginClick(getGoButton());
		loginClick(getCancel());
		confirmAlert();

	}

	public void existingOrderCancel(String orderId) {
		loginClick(getBookedItinerary());
		sendkeys(getOrderText(), orderId);
		

		loginClick(getGoButton());
		loginClick(getDynOder());
		confirmAlert();

	}

}
