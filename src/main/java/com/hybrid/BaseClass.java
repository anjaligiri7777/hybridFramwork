package com.hybrid;

import java.time.Duration;			
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.util.UtilityClass;

public class BaseClass {
	
	public  static WebDriver driver;
	public static String childewindow;
	public static String mainpage;
	public  static 	Actions act;
	
	 
	public void launchWebSite() 
	{
		 driver = new ChromeDriver();
		 
		 //Login url
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 //admin url
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	
		 UtilityClass.maxWindow();
		 UtilityClass.ImpliWait(5);
		 
	}
	
	public void WindowHandle() 
	{
		 Set<String> All_Id = driver.getWindowHandles();
	        Object[] Id = All_Id.toArray();
	      
	        UtilityClass.ImpliWait(5);
	        for(int i=0; i< Id.length ;i++) 
	        {
	        	if(Id[i].toString().equalsIgnoreCase(mainpage))
		    	{
		    		System.out.println(mainpage);
		    	}
		    	else
		    	{
		    		childewindow= Id[i].toString(); 		
		    	}
	        }
	        
	}
	public void getActionsClass() 
	{
		 act = new Actions(driver);
	}

	//baseclass upadate
	//oran

}
