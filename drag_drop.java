package com.infomats.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spras\\eclipse-workspace\\selenium_java\\driver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
		d.get("https://www.leafground.com/drag.xhtml");
//		WebElement one=d.findElement(By.id("form:drag"));
//		WebElement two=d.findElement(By.id("form:drop"));
     	Actions a=new Actions(d);
		//a.dragAndDrop(one, two).perform();
	
//		a.clickAndHold(one).moveToElement(two).release(two).perform();//alternative method 
		WebElement draggable = d.findElement(By.id("form:conpnl"));
		a.dragAndDropBy(draggable, 300, 0).perform();
		a.dragAndDropBy(draggable, -300, 0).perform();

	}

}
