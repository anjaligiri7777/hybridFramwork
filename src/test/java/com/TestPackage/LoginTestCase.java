package com.TestPackage;

import java.time.Duration;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hybrid.BaseClass;
import com.pompackage.LoginPagePom;


public class LoginTestCase extends BaseClass {
	
	BaseClass base = new BaseClass();
	public static String childewindow;
	@BeforeClass
	public void setup() 
	{  //super.launchWebSite();
		base.launchWebSite();
		
	}
	
	@AfterClass
    public void teardown() 
    {
    	//driver.close();
    }
//	@Test
//	public void getTitle() 
//	{   
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		Assert.assertEquals(title,"OrangeHRM");
//	}
//	@Test
//	public void LoginTest() 
//	{   
//		 LoginPagePom login = new  LoginPagePom();
//		 String username = login.getuser();
//		 String password = login.getpassword();
//		 login.setUsername(username);
//		 login.setPassword(password);
//		 login.SubmitButton();
//	}
	@Test
	public void LoginPageLinkTest() 
	{    
		 LoginPagePom login = new  LoginPagePom();
		    login.LoginPageLink();
		    base.WindowHandle();
			String mainpage = driver.getWindowHandle();
			System.out.println(mainpage);
	        Set<String> All_Id = driver.getWindowHandles();
	        Object[] Id = All_Id.toArray();
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	        for(int i=0; i< Id.length ;i++) 
	        {
	        	if(Id[i].toString().equalsIgnoreCase(mainpage))
		    	{
		    		System.out.println(mainpage);
		    	}
		    	else		    	{
		    		childewindow= Id[i].toString(); 				    	} 
	      }	 
	      
	}
	
	@Test
	public void NextOageTitle() 
	{  
		driver.switchTo().window(childewindow);
		String nextTitle = driver.getTitle();
		System.out.println(nextTitle);
		Assert.assertEquals(nextTitle,"Human Resources Management Software | OrangeHRM");
	}
	
	
	
	
	
	
	
	
	
	
}
