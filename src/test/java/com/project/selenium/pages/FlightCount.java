package com.project.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightCount {
	WebDriver driver;
	public FlightCount(WebDriver driver){
		this.driver=driver;
	}
	private By count=By.xpath("//div[@class='onewayflightinfo']");
	public void flights(){
		
		List<WebElement>list=driver.findElements(count);
		System.out.print("number of flights "+list.size());
		
	}

}
