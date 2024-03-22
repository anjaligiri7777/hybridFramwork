package com.hybrid;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public  static WebDriver driver;
	public  static 	Actions act;
	public static String childewindow;
	public static String mainpage;
	
	public void launchWebSite() 
	{
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	}
	public void getActionsClass() 
	{
		 act = new Actions(driver);
	}
	
	public void WindowHandle() 
	{
		 Set<String> All_Id = driver.getWindowHandles();
	        Object[] Id = All_Id.toArray();
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
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
	

}
