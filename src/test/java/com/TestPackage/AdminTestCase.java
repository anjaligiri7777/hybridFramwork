package com.TestPackage;

import java.sql.Driver;

import com.hybrid.BaseClass;

public class AdminTestCase extends BaseClass{
	BaseClass base = new BaseClass();
	
	public void setup() 
	{
		base.launchWebSite();
	}
	public void teardown() 
	{
		driver.close();
	}

}
