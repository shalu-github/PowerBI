/* testcases check TC_001, TC_002 , TC_003  */

package com.login_logout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static { 
		System.setProperty("webdriver.chrome.driver","./driver_1/chromedriver.exe");
		}
    public static void main(String[] args) throws InterruptedException {
       

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        //TESTCASE = TC_001
        // Navigate to the login page
        driver.get("https://facegenie-ams-school.web.app/");

        // Find the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
       WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));

        // Enter your credentials
        usernameField.sendKeys("testbams@gmail.com");
        passwordField.sendKeys("facegenie");
        Thread.sleep(1000);

        // Click the login button
       loginButton.click();

        // Wait for a few seconds (you may need to use WebDriverWait for more complex scenarios)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TESTCASE = TC_010 
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://facegenie-ams-school.web.app/")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.close();
    }
}
