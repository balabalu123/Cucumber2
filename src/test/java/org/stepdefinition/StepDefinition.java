package org.stepdefinition;


import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.pojoclass.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	PojoClass p;
	
	@Given("User launch Facebook Web Application")
	public void user_launch_Facebook_Web_Application() {
		
	    
	} 

	@Then("User verify Error message is displayed")
	public void user_verify_Error_message_is_displayed() {
		 String error = driver.findElement(By.xpath("//div[contains(text(),'incorrect')]")).getText();
		 System.out.println(error);
		 boolean errorMsg = error.contains("incorrect");
		 System.out.println(errorMsg);
	
	   
	}
	


	@Then("User verify Facebook Loginwebpage is displayed")
	public void user_verify_Facebook_Loginwebpage_is_displayed() {
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    boolean fb = url.contains("facebook");
	    System.out.println(fb);
	}
	@When("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String username, String password) {
	
		 p = new PojoClass();
		type(p.getUsernameFb(), username);
		type(p.getPassFb(), password);
		
		
	
	
	}

	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
		p = new PojoClass();
		buttonclick(p.getLoginFb());
		
	}



}
