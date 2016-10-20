package com.project.selenium.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.project.selenium.pages.FlightCount;
import com.project.selenium.pages.LoginPage;
import com.project.selenium.pages.SearchPage;

public class IRCTCTEST {
	@Test
	public void testIRCTC() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		LoginPage lp=new LoginPage(driver);
		lp.clickonflightticket();
		String pw=driver.getWindowHandle();
	    Set<String> allWindow=driver.getWindowHandles();
	    for(String s:allWindow){
			if(!pw.equals(s)){
				driver.switchTo().window(s);
				break;
			}
	}
	    SearchPage sp=new SearchPage(driver);
	    sp.clickOnWhere();
	    sp.clickOnTo();
	    sp.clickOnWhen();
	    sp.clickOnAdults();
	    sp.clickOnSearch();
	    FlightCount fc=new FlightCount(driver);
	    fc.flights();
	    driver.quit();
	}

}
