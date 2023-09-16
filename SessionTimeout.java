
//TESTCASE : TC_011

package com.login_logout;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SessionTimeout {

   
	static { 
		System.setProperty("webdriver.chrome.driver","./driver_1/chromedriver.exe");
		}
    public static void main(String[] args) throws InterruptedException {
       

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        try {
        	driver.get("https://facegenie-ams-school.web.app/");
        	System.out.println("the login page loading within 15 sec.");
        }
        catch(Exception e) {
        	System.out.println("the login page notload within 15 sec");
        }
        driver.close();
}
}