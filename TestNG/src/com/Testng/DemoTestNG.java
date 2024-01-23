package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	//	it apply on project level 
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("=====beforeMethod=====");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("=====afterMethod=====");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("=====afterClass=====");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("=====afterTest=====");
	}
	@Test(priority = 1)
	public void aLogittest() {
		System.out.println("U r in aLogintest");
	}
	@Test(priority = 2)
	public void sLogittest() {
		System.out.println("sLogintest");
	}
	@Test(priority = 3)
	public void mLogittest() {
		System.out.println("mLogintest");
	}









}
