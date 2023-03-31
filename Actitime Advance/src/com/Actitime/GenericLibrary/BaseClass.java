package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.LoginPage;

public class BaseClass {
	WebDriver driver;
	FileLibrary f=new FileLibrary();
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database connection successfully",true);
	}
	
	
	@AfterSuite
	public void Databasedisconnected() {
		Reporter.log("database disconnected successfully",true);
	}
	
	
	@BeforeClass
	public void LauchBrowser() throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLibrary f=new FileLibrary();
		String URL=f.readDataFromProperty("url");
		driver.get(URL);
	}
	@AfterClass
	public void ClosedBrowser() {
		driver.close();
		Reporter.log("Browser Close Successfull",true);
	}
	@BeforeMethod
	public void login() throws IOException {
	String username=f.readDataFromProperty("username");
	String pw = f.readDataFromProperty("password");
	LoginPage lp = new LoginPage(driver);
	lp.getUntbx().sendKeys(username);
	lp.getPwtbx().sendKeys(pw);
	lp.getLgbtn().click();
Reporter.log("Login Successfully",true);
}
	@AfterMethod
	public void  logout() {
	Reporter.log("Logout Successfully",true);
	}
}
