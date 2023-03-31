package com.Actitime.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Actitime.pom.HomePage;

public class CreateCustomer extends BaseClass {
@Test
public void crateCustomer(WebDriver driver) {
	HomePage hp = new HomePage(driver);
	hp.getTasklnk().click();
Reporter.log("customer created successfully");
}

}
