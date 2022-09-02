package com.pagemanager;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * @pageobjectmanger
 * 
 * 
 */
import com.pages.BookHotelPage;
import com.pages.BookingConformationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	/**
	 * @getters
	 * @private class
	 * class return
	 */
	
	private LoginPage loginPage;
	private SearchHotelPage searcHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConformationPage bookingConformationPage;
	private CancelBookingPage cancelBookingPage;
	
	//getter only
	public LoginPage getLoginPage() {
		return (loginPage == null)? loginPage=new LoginPage() :loginPage ;
	}
	public SearchHotelPage getSearcHotelPage() {
		
		return (searcHotelPage == null)? searcHotelPage=new SearchHotelPage() :searcHotelPage ;
	}
	public SelectHotelPage getSelectHotelPage() {
		
		return (selectHotelPage == null)? selectHotelPage=new SelectHotelPage() :selectHotelPage ;

	}
	public BookHotelPage getBookHotelPage() {
		
		return (bookHotelPage == null)? bookHotelPage=new BookHotelPage() :bookHotelPage ;

	}
	public BookingConformationPage getBookingConformationPage() {
		
		return (bookingConformationPage == null)? bookingConformationPage=new BookingConformationPage() :bookingConformationPage ;

	}
	public CancelBookingPage getCancelBookingPage() {
		
		return (cancelBookingPage == null)? cancelBookingPage=new CancelBookingPage() :cancelBookingPage ;

	}
	
}
