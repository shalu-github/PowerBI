package com.login_logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_align {
	static { 
		System.setProperty("webdriver.chrome.driver","./driver_1/chromedriver.exe");
		}
    public static void main(String[] args) throws InterruptedException {
       

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        //TESTCASE = TC_001
        // Navigate to the login page
        driver.get("https://facegenie-ams-school.web.app/");
        
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        int un_x= usernameField.getLocation().getX();
        int un_width= usernameField.getSize().getWidth();
        int un_heigth= usernameField.getSize().getHeight();
        
        int pwd_x= passwordField.getLocation().getX();
        int pwd_width= passwordField.getSize().getWidth();
        int pwd_heigth= passwordField.getSize().getHeight();
        
        if(un_x==pwd_x&&un_width==pwd_width&&un_heigth==pwd_heigth) {
        	System.out.println("username and password text box are aligned");
        }
        else {
        	System.out.println("not aligened ");
        }
    }

}
