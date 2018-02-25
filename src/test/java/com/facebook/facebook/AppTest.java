package com.facebook.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AppTest 

{
	 static WebDriver driver;

	// login
	static String url = "http://demo.iscripts.com/socialware/demo/";
	static String emailXpath = "//*[@id=\"user_email\"]";
	static String passwordXpath = "//*[@id=\"frmLogin\"]/div/div[2]/input";
	static String loginButtonXpath = "//*[@id=\"frmLogin\"]/div/div[3]/input";

	static String emailId = "user@iscripts.com";
	static String password = "User1234";

	// Logout
	static String dropdown = "//div[@class='userdisplayname']";
	static String logOut = "//a[contains(text(),'Log out')]";
	// homepage
	static String message = "//a[contains(text(),'Messages')]";
	

	 
	@Test
	public static void mainEngine() {
		
		
		login(emailId);
		
	}
	public static void login(String input) {
		enterText(emailXpath, input);
		enterText(passwordXpath, password);
	    click(loginButtonXpath);
	}
	@BeforeTest
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rayhan\\Downloads\\java\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
	    driver.get(url);


		
	}
	public static void enterText(String xpath,String input) {
		driver.findElement(By.xpath(xpath)).sendKeys(input);
		
	}
public static void click(String xpath) {
	driver.findElement(By.xpath(xpath)).click();
}

	
}






