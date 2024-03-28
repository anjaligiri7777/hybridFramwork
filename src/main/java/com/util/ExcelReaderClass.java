package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.imageio.stream.FileImageInputStream;

public class ExcelReaderClass {
	public static void main(String[] args) {
		System.out.println(currentDirectory);
	}
	public static  FileInputStream file;
	public static String currentDirectory = System.getProperty("user.dir");
	
	public static void ExcelReadMethod() throws FileNotFoundException 
	{
		file = new 	FileInputStream(currentDirectory+ "\\src\\test\\resources\\ExcelPackage");
	}

}
