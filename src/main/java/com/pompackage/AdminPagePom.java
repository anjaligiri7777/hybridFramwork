package com.pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;

public class AdminPagePom extends BaseClass{
	
	public AdminPagePom() 
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
    private WebElement	LeftArrow;
	
	@FindBy(xpath="//span[text()='Admin']")
    private WebElement	AdminOption;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill']")
    private WebElement	DownArrow;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
     
	//RollSelect
	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	private WebElement userRoll;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	private WebElement AdminRoll;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement ESSRoll;
	
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement Emp_Name;
	
	//StatusSelect
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;
	@FindBy(xpath="	(//div[@class='oxd-select-text-input'])[1]")
	private WebElement EnableOption;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement DisableOption;
	
	 
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//button[text()='Reset']")
	private WebElement resetButton;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	
	//Select UserRoll
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	@FindBy(xpath="//div[text()='Admin']")
	private WebElement AdminRole;
	@FindBy(xpath="//div[text()='ESS']")
	private WebElement ESSRole;
	
	
	@FindBy(xpath="// status (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusSelect;
	
	
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmpName;
 
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Username;
     
	@FindBy(xpath="// password (//input[@type='password'])[1]")
	private WebElement AdminPassword;

	@FindBy(xpath="// confirm password (//input[@type='password'])[2]")
	private WebElement Adminconfirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebutton;
    
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement canclebutton;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement adminLink;
	
	//Methods
	public void AdminLeftArrow() 
	{
		LeftArrow.click();
	}
	public void AdminDownArrow() 
	{
		DownArrow.click();
	}
	public void AdminGetUsername(String username) 
	{
		Username.sendKeys(username);
	}
	public void AdminGetUserRoll( ) 
	{
		act.click(userRoll).click(AdminOption).perform();
	}
	public void AdminGetEmpName( ) 
	{   
		act.click(EmpName).moveToElement(AdminOption).click().build().perform();
	}
	public void AdminGetStatus( ) 
	{   
		act.click(statusSelect).moveToElement(EnableOption).click().build().perform();
	}
	public void AdminAddButton( ) 
	{   
		addButton.click();
	}
	public void AdminAdduserRole( ) 
	{   
		act.click(userRole).moveToElement(AdminRole).click().build().perform();;
	}
	public void AdminPass( ) 
	{   
		AdminPassword.sendKeys("admin123");
	}
	public void AdminConfirmPass( ) 
	{   
		Adminconfirmpassword.sendKeys("admin123");
	}
	public void AdminSaveButton( ) 
	{   
		 savebutton.click();
	}
	public void AdminCancleButton( ) 
	{   
		 canclebutton.click();
	}
	public void AdminLink( ) 
	{   
		adminLink.click();
	}
	
	
	
	
	

}

		
