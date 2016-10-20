package com.project.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
private By flighttickets=By.xpath("//a[text()='Flight Tickets']");
public void clickonflightticket(){
	driver.findElement(flighttickets).click();
}

}
