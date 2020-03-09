package com.Logger.shabaan.DesignPattern_Structural_Proxy;

import java.sql.Driver;

public class WebExplorerHelper {
	public static void generateReport(String explorer,String report,String test) {
		Driver driver =null;
		switch(explorer) {
		case "Firefox":
		{
			driver=Firefox.getFirefoxDriver();
			switch(report)
			{
			case "HTML":
			{
				Firefox.generateHTMLReport(test, driver);
				break;
			}
			case "Junit":
			{
				Firefox.generateJUnitReport(test, driver);
				break;
			}
			}
			break;
		}
		case "Chrome":
		{
			driver=Chrome.getChromeDriver();
			switch(report)
			{
			case "HTML":
			{
				Chrome.generateHTMLReport(test, driver);
				break;
			}
			case "Junit":
			{
				Chrome.generateJUnitReport(test, driver);
				break;
			}
			}
			break;
		}
		}
	}
}
