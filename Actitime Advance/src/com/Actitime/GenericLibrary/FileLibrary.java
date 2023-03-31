package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
*This class a generic class which is having nonstatic methods to perform data driven
*@author akshay kolekar 
*
**/
public class FileLibrary {
	 public String readDataFromProperty(String key) throws IOException {
		 FileInputStream fis=new FileInputStream("./Testdata/commondata.property.txt");
		 Properties p=new Properties();
		 p.load(fis);
		String value = p.getProperty(key);
		return value;
	 }

}
