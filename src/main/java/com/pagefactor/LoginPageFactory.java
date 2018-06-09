package com.pagefactor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author benmj
 *
 */
public class LoginPageFactory {
	
	
	
	//Login function xpath
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@name,'email_address')]")
	private WebElement emailId;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@name,'password')]")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "(//*[contains(@class , 'ui-button-text')])[9]")
	private WebElement submit;
	
	//product list xpath

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
	
	
	

/*	public WebElement getMyAccount(){
		return myAccount;
	}
	
	public WebElement getEmailId(){
		return emailId;
	}
	

	public WebElement getPassword(){
		return password;
	}
	
	public WebElement getSubmit(){
		return submit;
	}

}
*/