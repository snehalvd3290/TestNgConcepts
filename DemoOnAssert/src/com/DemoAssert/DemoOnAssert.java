package com.DemoAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoOnAssert {
	WebDriver driver;

	@BeforeClass
	public void configueSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_new.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
	}
	@Test(priority = 1)
	public void emailId() {
		System.out.println("u r in email id");
		WebElement email_element= driver.findElement(By.xpath("//input[@id='email']"));
		email_element.sendKeys("abc");
	}
	@Test(priority = 2)
	public void password() {
		WebElement pwd_element= driver.findElement(By.xpath("//input[@id='password']"));
		pwd_element.sendKeys("abc@123");
	}
	@Test(priority = 3)
	public void login_assert() {
		WebElement login_element= driver.findElement(By.xpath("//button[starts-with(text(),\"Sign In\")]"));
		login_element.click();

		WebElement emailError_element=driver.findElement(By.xpath("//div[@id='email_error']"));

		String actualResult_emailError= emailError_element.getText();
		System.out.println(actualResult_emailError);

		String expectedResult_emailError="Please enter email as kiran@gmail.com";
		System.out.println("Before Assert Execution");
//		hard alert
//		Assert.assertEquals(actualResult_emailError, expectedResult_emailError);
		
//		soft alert
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(actualResult_emailError, expectedResult_emailError);
		System.out.println("-----After Assert Execution---------");
		
		WebElement passwordError_element=driver.findElement(By.xpath("//div[id='password_error']"));
		String actualResult_password= passwordError_element.getText();
		String expectedResult_password="Please enter password 123456";
		
		softassert.assertEquals(actualResult_password, expectedResult_password);
		
		softassert.assertAll();
			}
 
}


