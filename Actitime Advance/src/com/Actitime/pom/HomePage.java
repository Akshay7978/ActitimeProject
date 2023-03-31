package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//Declaration
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement tasklnk;
	
	@FindBy (xpath="//div[@id='container_reports']")
	private WebElement reportlnk;
	
	@FindBy (xpath="//div[@id='container_users']")
	private WebElement userlnk;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlnk;
	
	
	//initilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getTasklnk() {
		return tasklnk;
	}


	public WebElement getReportlnk() {
		return reportlnk;
	}


	public WebElement getUserlnk() {
		return userlnk;
	}


	public WebElement getLogoutlnk() {
		return logoutlnk;
	}
	
	//Utilization

}

