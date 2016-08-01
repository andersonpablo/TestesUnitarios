package br.com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimplesTesteSelenium {

	public static void main(String[] args) {

		ChromeDriver dr1 = new ChromeDriver();
		ChromeDriver dr2 = new ChromeDriver();

		
		dr1.get("http://yahoo.com");
		dr2.get("http://bbc.com");

	}
}
