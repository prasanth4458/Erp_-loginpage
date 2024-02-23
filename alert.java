package com.infomats.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spras\\eclipse-workspace\\selenium_java\\driver\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(co);
		d.get("https://www.leafground.com/alert.xhtml");
		d.manage().window().maximize();
		d.findElement(By.id("j_idt88:j_idt91")).click();
		Alert a=d.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]")).click();
		Alert a1=d.switchTo().alert();
		a1.dismiss();
		Thread.sleep(3000);
		
		d.findElement(By.name("j_idt88:j_idt95")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/div[1]/a")).click();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a/span")).click();
		Thread.sleep(3000);
		
		d.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(3000);
		Alert a3=d.switchTo().alert();
		a3.sendKeys("prasanth");
		a3.accept();
		Thread.sleep(3000);
		
		d.findElement(By.id("j_idt88:j_idt106")).click();
		Thread.sleep(3000);
		d.findElement(By.id("j_idt88:j_idt108")).click();
		Thread.sleep(3000);
		
		d.manage().window().minimize();
		Thread.sleep(3000);
		d.manage().window().fullscreen();
		

	}

}
