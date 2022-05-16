package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement loginBtn;
	
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement verifysearchTxt;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy (id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numberofRooms;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement searchBtn;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement verifyselectHotel;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement verifyBookhotel;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditcardNumber;
	
	@FindBy(id="cc_type")
	private WebElement creditcardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement booknowBtn;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(xpath="//td[contains(text(),'Booking')]")
	private WebElement verifybookingConfirmation;
	
	@FindBy(xpath="(//td[@align='right'])[17]")
	private WebElement verifyOrderNumber;
	
	@FindBy(xpath="//div[contains(text(),'address')] ")
	private WebElement verifyErrorMsg;

	public WebElement getVerifyErrorMsg() {
		return verifyErrorMsg;
	}
	@FindBy(id="email")
	private WebElement usernameFb;
	

	@FindBy(id="pass")
	private WebElement passFb;
	

	@FindBy(name="login")
	private WebElement loginFb;
	
	
	
	
	
	
	
	
	public WebElement getUsernameFb() {
		return usernameFb;
	}

	public WebElement getPassFb() {
		return passFb;
	}

	public WebElement getLoginFb() {
		return loginFb;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getVerifysearchTxt() {
		return verifysearchTxt;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberofRooms() {
		return numberofRooms;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getVerifyselectHotel() {
		return verifyselectHotel;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getVerifyBookhotel() {
		return verifyBookhotel;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditcardNumber() {
		return creditcardNumber;
	}

	public WebElement getCreditcardType() {
		return creditcardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBooknowBtn() {
		return booknowBtn;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getVerifybookingConfirmation() {
		return verifybookingConfirmation;
	}
	
	public WebElement getVerifyOrderNumber() {
		return verifyOrderNumber;
	}
	
	

}
