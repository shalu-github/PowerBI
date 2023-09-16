// TESTCASE : TC_004 ,TC_006, TC_007,TC_008 

package com.login_logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_masking {   
	static { 
		System.setProperty("webdriver.chrome.driver","./driver_1/chromedriver.exe");
		}
    public static void main(String[] args) throws InterruptedException {
       

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the login page
        driver.get("https://facegenie-ams-school.web.app/");

        // Find the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
       WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));

        // Enter your credentials
        usernameField.sendKeys("testbamsgmail.com");
        passwordField.sendKeys("facegenie");
        
         // TESTCASE = TC_004
        
        String username= usernameField.getAttribute("value");
         char sysmboleToCheckFor='@';
         if ( username.contains(String.valueOf(sysmboleToCheckFor))) {
        	 System.out.println("username cotains the symbole :"+sysmboleToCheckFor);
         }
         else {
        	 System.out.println("username not cotains the symbole :"+sysmboleToCheckFor);
         }
         
         driver.close(); 
         
         driver.get("https://facegenie-ams-school.web.app/");
         // TESTCASE = TC_006
         String[] usernameInput= {"TESTBAMS@GMAIL.COM","testbamsgmail.com"};
         String passwordInput="facegenie";
         
         for(String username_1:usernameInput) {
        	 WebElement usernameField_1 = driver.findElement(By.id("email"));
             WebElement passwordField_1 = driver.findElement(By.id("password"));
            WebElement loginButton_1 = driver.findElement(By.xpath("//button[text()='Log In']"));
            
            usernameField_1.sendKeys(username_1);
            
            passwordField_1.sendKeys(passwordInput);
            
            loginButton_1.click();
            
            usernameField_1.clear();
            passwordField_1.clear();
            
            
         }
         
         

         
}}
