package com.Logger.shabaan.DesignPattern_Structural_Proxy;

import java.sql.Driver;

public class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}
	public static void generateHTMLReport(String test,Driver driver) {
		System.out.println("Generating Chrome HTML Report");
	}
	public static void generateJUnitReport(String test,Driver driver) {
		System.out.println("Generating Chrome Junit Report");
	}
}