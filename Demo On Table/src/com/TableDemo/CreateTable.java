package com.TableDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver_new2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/pages/examples/dashboard.html");

		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();

		List<WebElement> list_row= driver.findElements(By.tagName("tr"));
		System.out.println("=== "+list_row.size());

		//	for (int i=1; i<5;i++) {
		//	List<WebElement> list_col= driver.findElements(By.tagName("td"));
		//	List<WebElement> list_col= list_row.get(i).findElements(By.tagName("td"));
		// System.out.println(list_col.size());

		//	for(int j=1;j<8; j++) {
		//		System.out.println(list_col.get(j).getText());
		//	}
		//System.out.println("====");
		// }


		//	Head Row Access with generalize coding
		for (int i=0; i<list_row.size();i++) {
			List<WebElement> list_col= list_row.get(i).findElements(By.tagName("th"));
			//List<WebElement> list_col1= list_row.get(i).findElements(By.tagName("td"));
			// System.out.println(list_row.get(i).getText());

			for(int j=0;j<list_col.size(); j++) {
				System.out.println(list_col.get(j).getText());
			}
			//System.out.println("************");
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

