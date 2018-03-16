package com.effectivetesting.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHomePage {
	private WebDriver driver;
	
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public AdminEntryPageObject goToEntrySection() {
		driver.findElement(By.xpath("/html/body/div/div/div/ul[1]/li[2]/a")).click();
		return new AdminEntryPageObject(driver);
	}
}
