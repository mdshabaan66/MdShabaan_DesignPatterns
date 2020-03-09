package com.Logger.shabaan.DesignPattern_Structural_Proxy;

import java.sql.Driver;

public class Firefox {
	public static Driver getFirefoxDriver() {
		return null;
	}
	public static void generateHTMLReport(String test,Driver driver) {
		System.out.println("Generating Firefox HTML Report");
	}
	public static void generateJUnitReport(String test,Driver driver) {
		System.out.println("Generating Firefox Junit Report");
	}
}