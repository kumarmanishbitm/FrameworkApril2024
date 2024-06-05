package com.saucelab.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;

	String filePath = "C:\\Users\\admin\\workspace\\FrameworkApril2024\\Configurations\\Config.properties";

	public ReadConfig(){

		try{
			properties = new Properties();

			FileInputStream  fis = new FileInputStream(filePath);
			properties.load(fis);

		} catch(Exception e){
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

	public String getBaseUrl(){

		String urlValue = properties.getProperty("URL");

		// check if value is not null
		if(urlValue!=null)

			return urlValue;

		else
			throw new RuntimeException("URL value not present in configuration file");		
	}

	public String getBrowser(){

		String browserValue = properties.getProperty("browser");

		// check if value is not null
		if(browserValue!=null)

			return browserValue;

		else
			throw new RuntimeException("Browser Value value not present in configuration file");		
	}
}

