package com.Logger.shabaan.DesignPattern_Structural_Proxy;

public class FacadePatternExample {

	public static void main(String[] args) {
		String test="CheckElementPresent";
		WebExplorerHelper.generateReport("Firefox", "HTML", test);
		WebExplorerHelper.generateReport("Firefox", "Junit", test);
		WebExplorerHelper.generateReport("Chrome", "HTML", test);
		WebExplorerHelper.generateReport("Chrome", "Junit", test);
	}

}
