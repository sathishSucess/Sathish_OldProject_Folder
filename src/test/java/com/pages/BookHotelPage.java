package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * bookHotel locators
 * 
 * 
 */
public class BookHotelPage extends BaseClass {

	/**
	 * constructor
	 * getters
	 * methods
	 * private WebElement
	 */
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNumber;
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(xpath="//td[contains(text(),'Booking')]")
	private WebElement bookConfMsg;
	@FindBy(xpath="//label[contains(text(),'Please Enter your Fir')]")
	private WebElement errFrist;
	@FindBy(xpath="//label[contains(text(),'Please Enter you La')]")
	private WebElement errLast;
	@FindBy(xpath="//label[contains(text(),'Please Enter your Ad')]")
	private WebElement errAdrss;
	@FindBy(xpath="//label[contains(text(),'Please Enter your 16')]")
	private WebElement errCredCard;
	@FindBy(xpath="//label[contains(text(),'Please Select your Credit Card Ty')]")
	private WebElement errCardType;
	@FindBy(xpath="//label[contains(text(),'Please Select your Credit Card Ex')]")
	private WebElement errExpmonth;
	@FindBy(xpath="//label[contains(text(),'Please Enter your Credit Card CVV')]")
	private WebElement errCardCvv;
	
	
	
	
	
	
	
	public WebElement getErrFrist() {
		return errFrist;
	}
	public WebElement getErrLast() {
		return errLast;
	}
	public WebElement getErrAdrss() {
		return errAdrss;
	}
	public WebElement getErrCredCard() {
		return errCredCard;
	}
	public WebElement getErrCardType() {
		return errCardType;
	}
	public WebElement getErrExpmonth() {
		return errExpmonth;
	}
	public WebElement getErrCardCvv() {
		return errCardCvv;
	}
	public WebElement getBookConfMsg() {
		return bookConfMsg;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNumber() {
		return ccNumber;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	public void bookHotel (String firstName,String lastName,String address ) {
		sendkeys(getFirstName(), firstName);
		sendkeys(getLastName(), lastName);
		sendkeys(getAddress(), address);
		
		
		loginClick(getBooknow());

}
	public void bookHotel () {
		
		loginClick(getBooknow());

}
	
	

		
		
}