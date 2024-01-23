package com.TableDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloads {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/pages/examples/dashboard.html");
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")).click();

		List<WebElement> list_row= driver.findElements(By.tagName("tr"));
		System.out.println("=== "+list_row.size());


		//	Head Row Access with generalize coding
		for (int i=0; i<list_row.size();i++) {
			List<WebElement> list_col= list_row.get(i).findElements(By.tagName("th"));

			for(int j=0;j<list_col.size(); j++) {
				System.out.println(list_col.get(j).getText());
			}
		}

		//  Row and Coloumn access with generalize coding
		for (int i=0; i<list_row.size();i++) {
			List<WebElement> list_col= list_row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<list_col.size(); j++) {
				System.out.println(list_col.get(j).getText());
			}
			System.out.println("**********************");
		}
	}

}
