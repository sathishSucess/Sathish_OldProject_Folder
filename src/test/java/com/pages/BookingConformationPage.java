package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * BookingConformation locators
 * 
 * 
 */
public class BookingConformationPage extends BaseClass  {
	
	/**
	 * constructor
	 * getters
	 * methods
	 * private WebElement
	 */
	
 String attributeValue;
	public BookingConformationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}
	public String getOrderId(String attributeName ) throws IOException {
		
		String attributeValue = getAttributeValue(getOrderNo(), attributeName);
		
		return attributeValue;

	}
	

	
	
	
	
}
