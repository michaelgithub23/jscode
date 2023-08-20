package org.tcs1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrennTask1 {
	public static void main(String[] args) throws IOException {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Express\\eclipse-workspace\\SeliniumScreenshot\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
//        driver.manage().window().maximize();
//        
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        
//        File s = screenshot.getScreenshotAs(OutputType.FILE);
//        File d = new File("D:\\new folder\\facebook.png");
//        
//        FileUtils.copyFile(s, d);
        
        TakesScreenshot screenshot =(TakesScreenshot)driver;
        
        System.out.println("============");
        
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        
        File Destination = new File("D:\\new folder\\facebook1.png");
        FileUtils.copyFile(source, Destination);
        
       
        System.out.println("***************************");
        
        
        
        
        
        
        
	
	}

}
