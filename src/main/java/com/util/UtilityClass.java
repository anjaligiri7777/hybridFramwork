package com.util;

import java.io.File;		
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hybrid.BaseClass;

public class UtilityClass extends BaseClass{
	
	public static void setText(String value,WebElement ele) 
	{
		ele.sendKeys(value);
	}
	public static void eleClick(WebElement ele) 
	{
		ele.click();
	}

	public static void ImpliWait(int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	public static void maxWindow() 
	{
		driver.manage().window().maximize();
	}
	public String takeScreenshot(String testname) throws IOException 
	{   
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		String currentTime = d.toString().replace(":", "_");
		String desti =ExcelReaderClass.currentDirectory+"//ScreenshotFolder//"+testname+currentTime+".png";
		File fy = new File(desti);
		FileUtils.copyFile(source,fy);
		return desti;
	}
	
}
