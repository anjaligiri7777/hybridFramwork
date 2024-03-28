package com.pompackage;

import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;
import com.util.UtilityClass;

public class AdminPagePom extends BaseClass{
	
	public AdminPagePom() 
	{
		PageFactory.initElements(driver,this);
	}
	String username="Admin";
	String Empname ="Admin";
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
    private WebElement	LeftArrow;
	
	@FindBy(xpath="//span[text()='Admin']")
    private WebElement	AdminOption;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill']")
    private WebElement	DownArrow;
	                //input[@class='oxd-input oxd-input--active']
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement Adminusername;
             
	//RollSelect   
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	private WebElement userRoll;
	@FindBy(xpath="(//div[@tabindex='0'])[1]")
	private WebElement AdminRoll;
	@FindBy(xpath="(//div[@tabindex='0'])[1]")
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	
	//Select UserRoll
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	@FindBy(xpath="//div[text()='Admin']")
	private WebElement AdminRole;
	@FindBy(xpath="//div[text()='ESS']")
	private WebElement ESSRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmpName;
	
	//select Status
	@FindBy(xpath="// status (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusSelect;
	@FindBy(xpath="//div[text()='Enabled']")
	private WebElement EnabledStatus;
	@FindBy(xpath="//div[text()='Disabled']")
	private WebElement DisabledStatus;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Adminusername2;
     
	@FindBy(xpath="// password (//input[@type='password'])[1]")
	private WebElement AdminPassword;

	@FindBy(xpath="//input[@type='password'])[2]")
	private WebElement Adminconfirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebutton;
    
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement canclebutton;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	private WebElement adminLink;
	
	/////////////////////////////Methods
	
	public void AdminLeftArrow() 
	{
		UtilityClass.eleClick(LeftArrow);
	}
	public void AdminDownArrow() 
	{
		UtilityClass.eleClick(DownArrow);
	}
	public void AdminGetUsername(String value) 
	{
       UtilityClass.setText(value, Adminusername);
	}
	public void AdminGetUserRoll( ) 
	{
		//act.click(userRoll).moveToElement(AdminOption).click(AdminOption).build().perform();
		UtilityClass.act.scrollToElement(AdminOption).moveToElement(AdminOption).click(AdminOption).build().perform();
	}
	public void AdminGetEmpName(String username) 
	{   
       UtilityClass.setText(username, EmpName);
	}
	public void AdminGetStatus( ) 
	{   
	//	act.click(statusSelect).moveToElement(EnabledStatus).click(EnabledStatus).build().perform();
	}
	public void SearchbuttonMethod() 
	{
		UtilityClass.eleClick(searchButton);
	}
	public void ResetButtonMethod() 
	{
		UtilityClass.eleClick(resetButton);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void AdminAddButton( ) 
	{   
		UtilityClass.eleClick(addButton);
	}
	public void AdminAdduserRole( ) 
	{   
		act.click(userRole).moveToElement(AdminRole).click(AdminRole).build().perform();
	}
	public void AdminAdduserEmpName( String username) 
	{   
		UtilityClass.setText(username, EmpName);
	}
	public void AdminAddUserStatus() 
	{
		act.click(statusSelect).moveToElement(EnabledStatus).click(EnabledStatus).build().perform();
	}
	public void AdminPass( String password) 
	{   
		UtilityClass.setText(password,AdminPassword);
	}
	public void AdminConfirmPass(String confirmpassword ) 
	{   
        UtilityClass.setText(confirmpassword, Adminconfirmpassword);
	}
	public void AdminSaveButton( ) 
	{   
		 UtilityClass.eleClick(savebutton);
	}
	public void AdminCancleButton( ) 
	{   
		 UtilityClass.eleClick(canclebutton);
	}
	public void AdminLink( ) 
	{   
		 UtilityClass.eleClick(adminLink);
	}
	

}

		
