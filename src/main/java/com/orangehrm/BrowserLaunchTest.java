
package com.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchTest {

    public static void main(String[] args) {

    	ChromeOptions options = new ChromeOptions();
    	options.setPageLoadStrategy(PageLoadStrategy.EAGER);

    	WebDriver driver = new ChromeDriver(options);
    	
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.manage().window().maximize();
             System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        driver.navigate().refresh();

        System.out.println("Page refreshed successfully!");
        
     // Navigate to another website
        driver.navigate().to("https://www.google.com/");

        System.out.println("Second Page Title: " + driver.getTitle());

        // Navigate back
        driver.navigate().back();

        System.out.println("After Back: " + driver.getTitle());

        // Navigate forward
        driver.navigate().forward();

        System.out.println("After Forward: " + driver.getTitle());
        
        //Close current browser
       /* driver.close();

        System.out.println("Current browser window closed!");
       */
        
        //Close all browser windows
        driver.quit();

        System.out.println("All browser windows closed and WebDriver session terminated!");

    }
}
