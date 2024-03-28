package com.TestPackage;

import java.sql.Driver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hybrid.BaseClass;
import com.pompackage.AdminPagePom;
import com.pompackage.LoginPagePom;

public class AdminTestCase extends BaseClass{
	BaseClass base = new BaseClass();

	
	@BeforeClass
	public void setup() {
		base.launchWebSite();
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@Test
	public void UserSystem() 
	{  
		LoginTestCase logintest = new LoginTestCase();
	     logintest.LoginTest();
	     
	     LoginPagePom loginpom = new LoginPagePom();
	     
		 AdminPagePom ad = new AdminPagePom();
		 ad.AdminLeftArrow();
		 ad.AdminGetUsername("admin");
		 ad.AdminAdduserRole();
		 
		
	     
		
	}
	
	}
