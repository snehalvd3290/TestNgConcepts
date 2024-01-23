package com.Testng;

import org.testng.annotations.Test;

public class Priority_Dependency {

	@Test (groups="regression")
	public void test01() {
		System.out.println("test01");
	}
	
	@Test (groups="regression")
	public void test02() {
		System.out.println("test02");
	}

	@Test (groups="sanity")
	public void test03() {
		System.out.println("test03");
	}

	@Test (groups="smoke")
	public void test04() {
		System.out.println("test04");
	}

	@Test (groups="sanity")
	public void test05() {
		System.out.println("test05");
	}
	
}
