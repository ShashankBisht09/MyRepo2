package com.project.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver){
		this.driver=driver;
	}
private By origin=By.xpath("//input[@id='origin']");
private By  destination=By.xpath("//input[@id='destination']");
private By time=By.xpath("//div[@id='where']/div[4]/img");
private By date=By.xpath("//td[@data-month='10']/a[text()='30']");
private By adult=By.id("noOfAdult");
private By searchbtn=By.xpath("//div[@onclick='submitSearch();']");

public void clickOnWhere() throws InterruptedException{
	driver.findElement(origin).sendKeys("Delhi");
	Thread.sleep(2000);
    driver.findElement(origin).sendKeys(Keys.TAB);
    }
public void clickOnTo() throws InterruptedException{
    driver.findElement(destination).sendKeys("shil");
    Thread.sleep(2000);
    driver.findElement(destination).sendKeys(Keys.TAB);
    }
public void clickOnWhen(){
    driver.findElement(time).click();
    driver.findElement(date).click();}

public void clickOnAdults(){
    Select sel=new Select(driver.findElement(adult));
    sel.selectByValue("2");}
public void clickOnSearch(){
   
    driver.findElement(searchbtn).click();
}
}
