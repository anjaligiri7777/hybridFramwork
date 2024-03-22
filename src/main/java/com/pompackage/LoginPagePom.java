package com.pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;
  //java design pattern page object model
public class LoginPagePom  extends BaseClass{
	
	public LoginPagePom () 
	{
		PageFactory.initElements(driver,this);
	}
	
	 @FindBy(xpath="//p[text()='Username : Admin']")
	 private WebElement username;
	
	 @FindBy(xpath="//p[text()='Password : admin123']")
	 private WebElement userpassword;
	 
	 @FindBy(xpath="//input[@name='username']")
     private WebElement userinput;
	
	 @FindBy(xpath="//input[@name='password']")
     private WebElement passwordinput;
    
	 @FindBy(xpath="//button[@type='submit']")
     private WebElement submitbutton;
	
    
	 @FindBy(xpath="//a[text()='OrangeHRM, Inc']")
     private WebElement LoginPageLink;
	 
	 public String getuser() 
	 {
		String original = username.getText();
		String username	= original.substring(original.indexOf('A'));
		return username;
	 }
	 public String getpassword() 
	 {  
		String original = userpassword.getText();
		String userpassword	= original.substring(original.lastIndexOf('a'));
		return userpassword;
	 }
	 public void setUsername(String username) 
	 {
		 userinput.sendKeys(username);
	 }
	 
	 public void setPassword(String userpassword ) 
	 {
		 passwordinput.sendKeys(userpassword);
	 }
	 
	 public void SubmitButton() 
	 {
		 submitbutton.click();
	 }
	 
	 public void LoginPageLink() 
	 {
		 LoginPageLink.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
